package com.max_hayday.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        //List values double type
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(3.6);
        list.add(9.2);
        list.add(4.7);
        list.add(12.1);
        list.add(5.0);
        System.out.print("Basic values from list: ");
        list.stream().forEach(aDouble -> System.out.print(aDouble + " "));
        System.out.println();

        //print max of each values from list on IntStream stream
        IntStream intStream = list.stream().mapToInt(aDouble -> (int) Math.ceil(aDouble));
        System.out.print("Maximum permissible value limits from list: ");
        intStream.forEach(a -> System.out.print(a + " "));

    }
}
