package com.max_hayday.javacore.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted.");
        }
        System.out.println("Main thread is finished.");
    }

    static class NewThread extends Thread {
        NewThread() {
            //create new thread of execution
            super("Demonstrated thread");
            System.out.println("Child thread : " + this);
            start();//start thread for execution
        }

        //Point entering in second thread
        @Override
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Child thread: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Child thread is interrupted.");
            }
            System.out.println("Child thread is finished.");
        }
    }
}

