package com.max_hayday.javacore.exercises.concurrency.exercise1;


public class FooTest {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new MyThread1(foo, "A");
        new MyThread2(foo, "B");
        new MyThread3(foo, "C");
    }
}
