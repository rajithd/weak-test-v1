package com.rd;

import java.util.Random;

public class App {
    public String method1(int num) {
        if (num > 7)
            return "More than 7";

        return "Less than 7";
    }

    public int doInt() {
        return new Random().nextInt(8);
    }

    public void anotherVeryUsefulBusinessMethod(String whatToDo){
        if ("work hard".equals(whatToDo)) {
            System.out.println("Working hard now");
        } else {
            System.out.println("I will not " + whatToDo);
        }
        methodImportant();
    }

    public Long methodImportant() {
        return Math.round(1000*Math.random());
    }

    public int methodNotSoImportant(int param) {
        if (param > 10) {
            return param;
        }

        return 0;
    }

    public String methodOfUnknownImportance() {
        return "Ululam Athenas Ferre";
    }

    public static void main(String args[]) {
        System.out.println("****************************************");
        System.out.println("hello world");
        System.out.println("****************************************");
    }
}
