package com.max_hayday.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //create and initialize the array
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        //show, sort and show one`s more content of array
        System.out.print("Base array: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        display(array);
        //fill array and print content
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Array after calling method fill(): ");
        display(array);
        //sort and print content of array
        Arrays.sort(array);
        System.out.print("Array after second sorting: ");
        display(array);
        //make binary search value -9
        int index = Arrays.binarySearch(array, -9);
        System.out.print("Value -9 stay on " + index + " position.");

    }

    static void display(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
