package com.max_hayday.javacore.exercises.concurrency.exercise2;

import java.util.concurrent.Semaphore;

public class FizzBuzz {
    private Semaphore semaphore = new Semaphore(4);
    int n;


    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz(int n) {
        try {
            semaphore.acquire();
            if (n % 3 == 0 && n % 5 != 0) {
                System.out.println("fizz");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }

    public void buzz(int n) {
        try {
            semaphore.acquire();
            if (n % 3 != 0 && n % 5 == 0) {
                System.out.println("buzz");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }

    public void fizzbuzz(int n) {
        try {
            semaphore.acquire();
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("fizzbuzz");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }

    public void number(int n) {
        try {
            semaphore.acquire();
            if (n % 3 != 0 && n % 5 != 0) {
                System.out.println(n);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}