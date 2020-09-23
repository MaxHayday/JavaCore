package com.max_hayday.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //create array list with Integer types
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Basic list: " + myList);

        //get stream elements from array list
        Stream<Integer> myStream = myList.stream();

        //get min and max value using max() min() isPresent() get() methods
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Min value: " + minVal.get());

        //get new stream,because privies calling method min() made it finally
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent())
            System.out.println("Max value: " + maxVal.get());

        //sort stream data,calling method sorted()
        Stream<Integer> sortedStream = myList.stream().sorted();

        //print sorted stream of data,call method forEach()
        System.out.print("Sorted stream of data: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //print only odd integer values,calling filter() method
        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //print only odd integer values > 5.
        oddVals = myList.stream().filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.print("Odd values > 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

    }
}
