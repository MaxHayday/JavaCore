package com.max_hayday.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        //create list array
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        //put elements in to list array
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Content of list array a1: " + a1);
        //get simple array
        Integer ia[] = new Integer[a1.size()];
        ia = a1.toArray(ia);
        int sum = 0;
        //summing elements from array
        for (int i : ia)
            sum += i;
        System.out.println("Sum: " + sum);

    }
}
