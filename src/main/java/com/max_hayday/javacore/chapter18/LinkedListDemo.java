package com.max_hayday.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList<String> ll = new LinkedList<String>();
        //Add elements in LinkedList
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Content of LinkedList ll: " + ll);
        //remove elements from LinkedList
        ll.remove("F");
        ll.remove(2);
        System.out.println("Content of LinkedList ll after removing elements: " + ll);
        //remove first and last elements from LinkedList
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Content of LinkedList after removing first and last elements: " + ll);
        //get and assign a value
        String val = ll.get(2);
        ll.set(2, val + " changed");

        System.out.println("Content of LinkedList ll after changing: " + ll);
    }
}
