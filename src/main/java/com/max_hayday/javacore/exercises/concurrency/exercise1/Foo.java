package com.max_hayday.javacore.exercises.concurrency.exercise1;

import java.util.concurrent.Semaphore;

public class Foo {
    Semaphore semaphore = new Semaphore(3);

    public void first() {
        try {
            semaphore.acquire();
            System.out.print("first");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();

    }

    public void second() {
        try {
            semaphore.acquire();
            System.out.print("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }

    public void third() {
        try {
            semaphore.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}
