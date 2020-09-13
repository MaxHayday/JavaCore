package com.max_hayday.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;//declare a link to the functional interface

        //Here lambda expression is just a constant expression
        //When it is assigned with the reference variable myNum,
        // an instance of the class is obtained in which the lambda
        // expression implements the getValue() method from the functional interface MyNumber
        myNum = () -> 123.45;
        //call method getValue() from lambda expression
        System.out.println("Random value: " + myNum.getValue());
        //here is more complicated expression
        myNum = () -> Math.random() * 100;

        System.out.println("Random value: " + myNum.getValue());
        System.out.println("One more complicated expression: " + myNum.getValue());
        //Lambda expression needs to be compatible with abstract method from functional interface
        //myNum = () ->"123.03";// Error
    }
}

interface MyNumber {
    double getValue();
}
