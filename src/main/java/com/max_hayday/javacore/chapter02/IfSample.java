package com.max_hayday.javacore.chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if (x < y) System.out.println("x less then y");
        x *= 2;
        if (x == y) System.out.println("now x equal y");
        x *= 2;
        if (x > y) System.out.println("now x more then y");
        //this operator will not output anything
        if (x == y) System.out.println("you will not see it");
    }
}
