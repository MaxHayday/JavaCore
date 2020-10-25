package com.max_hayday.javacore.chapter11;


public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");//run threads for execution
        new NewThread("Two");
        new NewThread("Three");

        try {
            //waiting for finished threads for execution
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted.");
        }
        System.out.println("Main thread is finished.");
    }

    static class NewThread implements Runnable {
        String name;//name thread execution
        Thread t;

        NewThread(String threadName) {
            name = threadName;
            t = new Thread(this, name);
            System.out.println("New thread: " + t);
            t.start();//start thread
        }

        //Point entering in thread
        @Override
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(name + ": " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(name + " is finished.");
            }
        }
    }
}
