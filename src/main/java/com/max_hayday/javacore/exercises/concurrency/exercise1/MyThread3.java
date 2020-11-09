package com.max_hayday.javacore.exercises.concurrency.exercise1;


public class MyThread3 implements Runnable {
    String name;
    Foo f;

    public MyThread3(Foo f, String name) {
        this.f = f;
        this.name = name;
        new Thread(this).start();

    }

    @Override
    public void run() {
        f.third();
    }
}