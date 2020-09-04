package com.max_hayday.javacore.chapter18;

import java.util.ArrayList;

public class Spliterator {
    public static void main(String[] args) {
        //Create ArrayList whith double type
        ArrayList<Double> vals = new ArrayList<>();

        //add values to ArrayList vals
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        //call method tryAdvance() for showing content ArrayList vals
        System.out.print("Content of ArrayList vals:\n");
        java.util.Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        //Create new ArrayList which will contains square roots of numeric values
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;
        //call method forEachRemaining() for showing content of sqrs
        System.out.println("Content of ArrayList sqrs: \n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println(spliterator.estimateSize());

    }
}
