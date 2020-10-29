package com.max_hayday.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }

    //Shared resource
    static class Shared {
        static int count = 0;
    }

    //Thread of execution what incremented value
    static class IncThread implements Runnable {
        String name;
        Semaphore sem;

        public IncThread(Semaphore sem, String name) {
            this.sem = sem;
            this.name = name;
            new Thread(this).start();
        }

        @Override
        public void run() {
            System.out.println("Run thread " + name);
            try {
                //first get permission
                System.out.println("Thread " + name + " is waiting for permission");
                sem.acquire();
                System.out.println("Thread " + name + " get permission");
                //now get access to the shared resource
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(name + ": " + Shared.count);
                    //allow context switching if possible
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            //release permission
            System.out.println("Thread " + name + " release permission");
            sem.release();
        }
    }

    //Thread of execution,decrements count value
    static class DecThread implements Runnable {
        String name;
        Semaphore sem;

        public DecThread(Semaphore sem, String name) {
            this.sem = sem;
            this.name = name;
            new Thread(this).start();
        }

        @Override
        public void run() {
            System.out.println("Run thread " + name);
            try {
                //first get permission
                System.out.println("Thread " + name + " is waiting for permission");
                sem.acquire();
                System.out.println("Thread " + name + " get permission");
                //now get access to the shared resource
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(name + ": " + Shared.count);
                    //allow context switching if possible
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            //release permission
            System.out.println("Thread " + name + " release permission");
            sem.release();
        }
    }
}
