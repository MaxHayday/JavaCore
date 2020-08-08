package com.max_hayday.javacore.chapter02;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b equals " + b);
        b = true;
        System.out.println("b equals " + b);
        if (b) System.out.println("This code is executed.");
        b = false;
        if (b) System.out.println("This code is`t executed");
        System.out.println("10 > 9 equals " + (10 > 9));

    }
}
