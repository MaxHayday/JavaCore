package com.max_hayday.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //List of double
        ArrayList<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);
        //print sqrt of elements from list in new stream
        Stream<Double> sqrtRootStrm = list.stream().map(a -> Math.sqrt(a));

        //get the product of square roots
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Product of square roots equals " + productOfSqrRoots);

    }
}
