package com.max_hayday.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i = 100, j = 200;
        //calculate the average value of variables i and j
        while (++i < --j) ;//this loop have not body
        System.out.println("Average value is " + i);
    }
}
