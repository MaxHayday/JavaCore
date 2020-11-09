package com.max_hayday.javacore.exercises.concurrency.exercise2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FizzBuzzTest {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("A", new FizzBuzz(15));
        MyThread2 myThread2 = new MyThread2("B", new FizzBuzz(15));
        MyThread3 myThread3 = new MyThread3("C", new FizzBuzz(15));
        MyThread4 myThread4 = new MyThread4("D", new FizzBuzz(15));
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(myThread1);
        service.execute(myThread2);
        service.execute(myThread3);
        service.execute(myThread4);


        service.shutdown();
    }

    static class FizzBuzz {
        volatile int n;

        public FizzBuzz(int n) {
            this.n = n;
        }

        public synchronized void fizz(int n) {
            if (n % 3 == 0 && n % 5 != 0) {
                System.out.println("fizz");
            }
        }

        public synchronized void buzz(int n) {
            if (n % 3 != 0 && n % 5 == 0) {
                System.out.println("buzz");
            }
        }

        public synchronized void fizzbuzz(int n) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("fizzbuzz");
            }
        }

        public synchronized void number(int n) {
            if (n % 3 != 0 && n % 5 != 0) {
                System.out.println(n);
            }
        }
    }

    static class MyThread1 implements Runnable {
        String name;
        FizzBuzz fizzBuzz;

        public MyThread1(String name, FizzBuzz fizzBuzz) {
            this.name = name;
            this.fizzBuzz = fizzBuzz;
            new Thread(this);

        }

        @Override
        public void run() {
            for (int i = 1; i <= fizzBuzz.n; i++) {
                fizzBuzz.fizz(i);
            }
        }
    }

    static class MyThread2 implements Runnable {
        String name;
        FizzBuzz fizzBuzz;


        public MyThread2(String name, FizzBuzz fizzBuzz) {
            this.name = name;
            this.fizzBuzz = fizzBuzz;
            new Thread(this);

        }

        @Override
        public void run() {
            for (int i = 1; i <= fizzBuzz.n; i++) {
                fizzBuzz.buzz(i);
            }
        }
    }

    static class MyThread3 implements Runnable {
        String name;
        FizzBuzz fizzBuzz;


        public MyThread3(String name, FizzBuzz fizzBuzz) {
            this.name = name;
            this.fizzBuzz = fizzBuzz;
            new Thread(this);

        }

        @Override
        public void run() {
            for (int i = 1; i <= fizzBuzz.n; i++) {
                fizzBuzz.fizzbuzz(i);
            }
        }
    }

    static class MyThread4 implements Runnable {
        String name;
        FizzBuzz fizzBuzz;


        public MyThread4(String name, FizzBuzz fizzBuzz) {
            this.name = name;
            this.fizzBuzz = fizzBuzz;
            new Thread(this);

        }

        @Override
        public void run() {
            for (int i = 1; i <= fizzBuzz.n; i++) {
                fizzBuzz.number(i);
            }
        }
    }
}
