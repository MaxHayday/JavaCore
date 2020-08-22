package com.max_hayday.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //create array
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Beginning size of list array a1: " + a1.size());

        //put elements in array
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Size list array a1 after putting elements: " + a1.size());

        //show list array
        System.out.println("Content of list array a1: " + a1);

        //remove elements from list array
        a1.remove("F");
        a1.remove(2);
        System.out.println("Size list array a1 after removing elements: " + a1.size());
        System.out.println("Content of list array a1: " + a1);
    }
}
