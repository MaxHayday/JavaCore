package com.max_hayday.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Create TeeSet
        TreeSet<String> ts = new TreeSet<>();
        //add elements in to TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println(ts.subSet("C","F"));
    }
}
