package com.max_hayday.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        //Create empty LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        //create comparator with revers option
        Comparator<Integer> r = Collections.reverseOrder();

        //sort list with this comparator r
        Collections.sort(ll, r);
        System.out.print("List is sorted in revers order: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        //shuffle list
        Collections.shuffle(ll);
        //Show shuffled list
        System.out.print("List is shuffled: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }

}
