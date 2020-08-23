package com.max_hayday.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //create ArrayDeque
        ArrayDeque<String> adq = new ArrayDeque<>();
        //Using class ArrayDeque to create stack
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("Getting from stack: ");
        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();

    }
}
