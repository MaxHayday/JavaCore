package com.max_hayday.javacore.chapter02;

public class LifeTime {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            int y = -1;//variable y initializing in every occurrence in block code
            System.out.println("y equals: " + y);//here every time will value -1
            y = 100;
            System.out.println("y equals: " + y);
        }
    }
}
