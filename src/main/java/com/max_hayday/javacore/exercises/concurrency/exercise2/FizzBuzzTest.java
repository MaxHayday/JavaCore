package com.max_hayday.javacore.exercises.concurrency.exercise2;


public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        new MyThread1("A", fizzBuzz);
        new MyThread2("B", fizzBuzz);
        new MyThread3("C", fizzBuzz);
        new MyThread4("D", fizzBuzz);
    }
}
