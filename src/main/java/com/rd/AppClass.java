package com.rd;

/**
 * Created by rajith on 10/6/16.
 */
public class AppClass {

    private String name;

    public void execute2(){
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class AppClassInner {

        private String name1;

        public String getName1() {
            return name1;
        }

        public void setName1(String name1) {
            this.name1 = name1;
        }
    }
}
