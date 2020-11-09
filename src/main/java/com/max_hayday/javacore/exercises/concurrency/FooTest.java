package com.max_hayday.javacore.exercises.concurrency;

import java.util.concurrent.Semaphore;

public class FooTest {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Semaphore semaphore = new Semaphore(3);
        new MyThread1(semaphore, foo, "A");
        new MyThread2(semaphore, foo, "B");
        new MyThread3(semaphore, foo, "C");


    }

    static class Foo {
        public void first() {
            System.out.print("first");
        }

        public void second() {
            System.out.print("second");
        }

        public void third() {
            System.out.print("third");
        }
    }

    static class MyThread1 implements Runnable {
        Semaphore semaphore;
        String name;
        Foo f;

        public MyThread1(Semaphore semaphore, Foo f, String name) {
            this.semaphore = semaphore;
            this.f = f;
            this.name = name;
            new Thread(this).start();

        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                f.first();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }
    }

    static class MyThread2 implements Runnable {
        Semaphore semaphore;
        String name;
        Foo f;

        public MyThread2(Semaphore semaphore, Foo f, String name) {
            this.semaphore = semaphore;
            this.f = f;
            this.name = name;
            new Thread(this).start();

        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                f.second();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }
    }

    static class MyThread3 implements Runnable {
        Semaphore semaphore;
        String name;
        Foo f;

        public MyThread3(Semaphore semaphore, Foo f, String name) {
            this.semaphore = semaphore;
            this.f = f;
            this.name = name;
            new Thread(this).start();

        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                f.third();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }
    }

}
