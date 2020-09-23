package com.max_hayday.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        //create list with Integer types
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        //two examples to get result multiplication integer elements of list using method reduce()
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent())
            System.out.println("First result in Optional type: " + productObj.get());
        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Second result in int type: " + product);
    }
}
