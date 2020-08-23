package com.max_hayday.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //create HashSet
        HashSet<String> hs = new HashSet<>();
        //put elements in HashSet
        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);

    }
}
