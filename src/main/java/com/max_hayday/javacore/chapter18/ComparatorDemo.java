package com.max_hayday.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        //create TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        //add elements to TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        //show elements from TreeSet
        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();


    }
}

class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
      //  String aStr = a, bStr = b;
        //compare in reverse order
        return b.compareTo(a);// bStr.compareTo(aStr);
    }
    //Dont need to override method equalse()
}
