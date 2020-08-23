package com.max_hayday.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        //Create ArrayList for integers
        ArrayList<Integer> vals = new ArrayList<>();
        //Add numbers to ArrayList
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        //make loop for showing numbers
        System.out.println("Content of ArrayList vals: ");
        for (int v :
                vals) {
            System.out.print(v + " ");
        }
        System.out.println();
        //Summing elements in loop for
        int sum = 0;
        for (int v :
                vals) {
            sum += v;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
