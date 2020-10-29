package com.max_hayday.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        System.out.println("Run this thread");
        new MyThread(cd1);
        try {
            cd1.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Finishing thread of execution");

    }

    static class MyThread implements Runnable {
        CountDownLatch latch;

        MyThread(CountDownLatch c) {
            latch = c;
            new Thread(this).start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                latch.countDown();//countdown
            }
        }
    }
}
