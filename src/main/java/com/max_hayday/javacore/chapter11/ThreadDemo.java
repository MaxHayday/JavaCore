package com.max_hayday.javacore.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();//create new thread

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
}

//Create second thread
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //create new, second thread
        t = new Thread(this, "Demonstrated thread");
        System.out.println("Child thread created: " + t);
        t.start();// start a thread of execution
    }

    //Point entering in second thread of execution
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Child thread is interrupted");
        }
        System.out.println("Child thread is finished.");
    }
}
