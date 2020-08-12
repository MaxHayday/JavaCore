package com.max_hayday.javacore.chapter07;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();
        int i = 88;
        overloadDemo.test();
        overloadDemo.test(10, 20);
        overloadDemo.test(i);
        overloadDemo.test(123.2);
    }

    static class OverloadDemo {
        void test() {
            System.out.println("Without parameters");
        }

        void test(int a, int b) {
            System.out.println("a and b: " + a + " " + b);
        }

        void test(double a) {
            System.out.println("Inner call conversion test(double) a: " + a);
        }
    }
}
