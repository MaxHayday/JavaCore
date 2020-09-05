package com.max_hayday.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //base size of vector is - 3, increment - 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Base size of vector is: " + v.size());
        System.out.println("Base capacity of vector is: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity of vector after adding 4 elements: " + v.capacity());
        v.addElement(5);
        System.out.println("Current capacity of vector is: " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Current capacity of vector is: " + v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("Current capacity of vector is: " + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("First element of vector is: " + v.firstElement());
        System.out.println("Last element of vector is: " + v.lastElement());
        if (v.contains(3))
            System.out.println("Vector contains 3.");
        //Print elements of vector
        Enumeration<Integer> vEmum = v.elements();
        System.out.println("\nElements of vector:");
        while (vEmum.hasMoreElements())
            System.out.print(vEmum.nextElement() + " ");
        System.out.println();
    }
}
