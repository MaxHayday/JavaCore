package com.max_hayday.javacore.exercises.concurrency.exercise2;

public class MyThread3 implements Runnable {
    private String name;
    private FizzBuzz fizzBuzz;


    public MyThread3(String name, FizzBuzz fizzBuzz) {
        this.name = name;
        this.fizzBuzz = fizzBuzz;
        new Thread(this).start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= fizzBuzz.n; i++) {
            fizzBuzz.fizzbuzz(i);
        }
    }
}
