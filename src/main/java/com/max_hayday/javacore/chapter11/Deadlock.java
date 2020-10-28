package com.max_hayday.javacore.chapter11;

public class Deadlock implements Runnable {
    public static void main(String[] args) {
        new Deadlock();
    }

    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Competitive thread");
        t.start();
        a.foo(b);//get block for object a in this thread
        System.out.println("Back to the main thread");

    }


    @Override
    public void run() {
        b.bar(a);//get block for object b in second thread
        System.out.println("Back to the main thread");
    }

    static class A {
        synchronized void foo(B b) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " enter in method A.foo()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Class A interrupted");
            }
            System.out.println(name + " try to call method B.last()");
            b.last();
        }

        synchronized void last() {
            System.out.println("In method A.last()");
        }
    }

    class B {
        synchronized void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " enter in method B.bar()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Class B interrupted.");
            }
            System.out.println(name + " try call method A.last()");
            a.last();
        }

        synchronized void last() {
            System.out.println("In method A.last()");
        }
    }


}
