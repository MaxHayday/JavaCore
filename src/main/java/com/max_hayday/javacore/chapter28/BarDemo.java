package com.max_hayday.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Start threads");
        new Mythread(cb, "A");
        new Mythread(cb, "B");
        new Mythread(cb, "C");
        new Mythread(cb, "X");
        new Mythread(cb, "Y");
        new Mythread(cb, "Z");
    }

    //Thread of execution, witch use barrier CyclicBarrier
    static class Mythread implements Runnable {
        CyclicBarrier cbar;
        String name;

        public Mythread(CyclicBarrier cbar, String name) {
            this.cbar = cbar;
            this.name = name;
            new Thread(this).start();
        }

        @Override
        public void run() {
            System.out.println(name);
            try {
                cbar.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println(e);
            }
        }
    }

    //Object of this class will call when reached barrier CyclicBarrier
    static class BarAction implements Runnable {
        @Override
        public void run() {
            System.out.println("Barrier reached!");
        }
    }
}
