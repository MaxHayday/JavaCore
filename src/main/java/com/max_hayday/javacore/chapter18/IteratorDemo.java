package com.max_hayday.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList<String> al = new ArrayList<>();
        //Add elements to ArrayList
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        //use iterators to output content of al ArrayList
        System.out.println("Content of ArrayList al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        //Change counted elements
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");

        }
        System.out.println("Changed content of ArrayList al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        //Show list in revers order
        System.out.println("Changed in revers list: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }

}
