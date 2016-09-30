package com.rd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexey Z
 */
public class AppTest {
    private final App app = new App();

//    @Test
//    public void testMethod1() throws Exception {
//        Assert.assertEquals(app.method1(5), "Less than 7");
//    }
//
//    @Test
//    public void testDoIt() throws Exception {
//
//    }


    @Test
    public void testAnotherVeryUsefulBusinessMethod() throws Exception {
        app.anotherVeryUsefulBusinessMethod("Bake potatos");
        app.anotherVeryUsefulBusinessMethod("Run integration tests");
    }

    @Test
    public void testMethodImportant() throws Exception {
        Assert.assertTrue(1001 > app.methodImportant());
    }

    @Test
    public void testMethodNotSoImportant() throws Exception {
        assertEquals(11, app.methodNotSoImportant(11));
        assertEquals(0, app.methodNotSoImportant(9));
    }

    @Test
    public void testMethodOfUnknownImportance() throws Exception {
        // todo Implement test
    }

    @Test
    public void testFail1() throws Exception {
        throw new RuntimeException();
    }

    @Test
    public void testFail2() throws Exception {
        throw new RuntimeException();
    }

    @Test
    public void testSOUT() throws Exception {
        System.out.println("Running testSOUT L1");
        System.out.println("Running testSOUT L2");
        System.out.println("Running testSOUT L3");
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
    }

    @Test
    public void testSOUT1() throws Exception {
        System.out.println("Running testSOUT1 L1");
        System.out.println("Running testSOUT1 L2");
        System.out.println("Running testSOUT1 L3");
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
    }

    @Test
    public void testA() throws Exception {
        doTestResult("aa","jj");
    }

    private static void doTestResult(String contents,
                                     String goldenResult) {

        doTestResult("","","");
    }

    private static void doTestResult(String contents,
                                     String goldenResult, String abc) {

        assertEquals(contents, goldenResult);
    }



    @Test
    public void testCall() throws Exception {
        u("aa");
    }

    @Test
    public void testAnotherCall() throws Exception {
        Check.check("aa");
    }

    private void u(String name) {
        assertEquals(name, "abc");
    }

//    @Test
//    public void test1() throws Exception {
//        if(false){
//            Assert.assertTrue(true);
//        }
//
//    }


}