package com.max_hayday.javacore.chapter02;

public class Coпversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConvert int type into byte type ");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConvert type double into type int.");
        i = (int) b;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConvert type double into type byte");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
