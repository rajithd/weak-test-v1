package com.rd;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajith on 9/29/16.
 */
public class JavaParserTest {

    public static void main(String[] args) throws ParseException, IOException {

        FileInputStream in = new FileInputStream("/Users/rajith/projects/crossover/test_projects/weak-test-v1/src/test/java/com/rd/AppTest.java");

        CompilationUnit cu;
        try {
            cu = JavaParser.parse(in);
        } finally {
            in.close();
        }
//        new MethodVisitor().visit(cu, null);

        List<TypeDeclaration> types = cu.getTypes();
        for(TypeDeclaration typeDeclaration : types){
            if(typeDeclaration instanceof ClassOrInterfaceDeclaration){
                ClassOrInterfaceDeclaration classOrInterfaceDeclaration = (ClassOrInterfaceDeclaration) typeDeclaration;
                List<BodyDeclaration> members = classOrInterfaceDeclaration.getMembers();
                for(BodyDeclaration bodyDeclaration : members){
                    if(bodyDeclaration instanceof MethodDeclaration){
                        MethodDeclaration methodDeclaration = (MethodDeclaration) bodyDeclaration;
                        BlockStmt body = methodDeclaration.getBody();
                        List<Statement> stmts = body.getStmts();
                        for(Statement statement : stmts){
                            if(statement instanceof ExpressionStmt){
                                ExpressionStmt expressionStmt = (ExpressionStmt) statement;
                                expressionStmt.getExpression();
                            }
                        }

                    }
                }

            }
        }


    }

    private static class MethodVisitor extends VoidVisitorAdapter {
        @Override
        public void visit(MethodCallExpr methodCall, Object arg) {
            System.out.print("Method call: " + methodCall.getName() + "\n");
            List<Expression> args = methodCall.getArgs();
            if (args != null)
                handleExpressions(args);
        }

        private void handleExpressions(List<Expression> expressions) {
            for (Expression expr : expressions) {
                if (expr instanceof MethodCallExpr)
                    visit((MethodCallExpr) expr, null);
                else if (expr instanceof BinaryExpr) {
                    BinaryExpr binExpr = (BinaryExpr) expr;
                    handleExpressions(Arrays.asList(binExpr.getLeft(), binExpr.getRight()));
                }
            }
        }
    }


}
