package com.max_hayday.javacore.exercises.concurrency;

public class FooTest {
    public static void main(String[] args) {
        Foo foo = new Foo();
        MyThread1 thread1 = new MyThread1(foo, "A");
        MyThread2 thread2 = new MyThread2(foo, "B");
        MyThread3 thread3 = new MyThread3(foo, "C");

        try {
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    static class Foo {

        public void first() {
            System.out.print("first");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }

        public void second() {
            System.out.print("second");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        public void third() {
            System.out.print("third");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }

    }

    static class MyThread1 implements Runnable {
        Foo f;
        String name;
        Thread t;

        public MyThread1(Foo f, String name) {
            this.f = f;
            this.name = name;
            t = new Thread(this);
            t.start();
        }

        @Override
        public void run() {
            synchronized (f) {
                f.first();
            }
        }
    }

    static class MyThread2 implements Runnable {
        Foo f;
        String name;
        Thread t;

        public MyThread2(Foo f, String name) {
            this.f = f;
            this.name = name;
            t = new Thread(this);
            t.start();
        }

        @Override
        public void run() {
            synchronized (f) {
                f.second();
            }
        }
    }

    static class MyThread3 implements Runnable {
        Foo f;
        String name;
        Thread t;

        public MyThread3(Foo f, String name) {
            this.f = f;
            this.name = name;
            t = new Thread(this);
            t.start();
        }

        @Override
        public void run() {
            synchronized (f) {
                f.third();
            }
        }
    }

}
