package com.max_hayday.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo2 {
    static class MyPharser extends Phaser {
        int numPhases;

        MyPharser(int parties, int phaseCount) {
            super(parties);
            numPhases = phaseCount - 1;
        }
        //override method onAdvance(), to execute quantity of phases

        @Override
        protected boolean onAdvance(int phase, int registeredParties) {
            //next operator println() we need just for displaying.As rule method onAdvance() did not showing
            //some information
            System.out.println("Phase " + phase + " is finished.\n");
            //return true, if all phases is finished
            if (phase == numPhases || registeredParties == 0) return true;

            //in another way return false;
            return false;
        }
    }

    static class MyThread implements Runnable {
        Phaser phaser;
        String name;

        MyThread(Phaser phaser, String name) {
            this.phaser = phaser;
            this.name = name;
            this.phaser.register();
            new Thread(this).start();
        }

        @Override
        public void run() {
            while (!phaser.isTerminated()) {
                System.out.println("Thread " + name + " is start phase " + phaser.getPhase());
                phaser.arriveAndAwaitAdvance();
                //small pause
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
    }

    public static void main(String[] args) {
        MyPharser pharser = new MyPharser(1, 4);
        System.out.println("Start threads\n");
        new MyThread(pharser, "A");
        new MyThread(pharser, "B");
        new MyThread(pharser, "C");
        //waite for finishing phases
        while (!pharser.isTerminated()) {
            pharser.arriveAndAwaitAdvance();
        }
        System.out.println("Synchronizer of phase is finished");

    }
}
