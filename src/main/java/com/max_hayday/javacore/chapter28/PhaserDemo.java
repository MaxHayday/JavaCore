package com.max_hayday.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("Start threads");
        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        //waiting for finish first phase of all threads
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " is finished");

        //waiting for finish second phase of all threads
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " is finished");

        //waiting for finish second phase of all threads
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " is finished");

        //unregister main thread
        phaser.arriveAndDeregister();
        if (phaser.isTerminated())
            System.out.println("Synchronizer of phase is finished");
    }
}

class MyThread implements Runnable {
    Phaser phaser;
    String name;

    public MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " starts the first phase");
        phaser.arriveAndAwaitAdvance();//inform about rich phase
        //Small pause, to save withdrawal order.
        //Just for illustration,but not necessary for correct working synchronized phase
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " start second phase");
        phaser.arriveAndAwaitAdvance();// inform about rich phase

        //Small pause, to save withdrawal order.
        //Just for illustration,but not necessary for correct working synchronized phase
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " is start third phase");
        phaser.arriveAndDeregister();//inform about rich phase and unregister threads
    }
}
