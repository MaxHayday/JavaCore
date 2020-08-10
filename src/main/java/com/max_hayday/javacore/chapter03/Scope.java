package com.max_hayday.javacore.chapter03;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; //Error! Variable y isn`t available in this scope, but x is available.
        System.out.println("x equals " + x);
    }
}
