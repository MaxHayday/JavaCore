package com.max_hayday.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }

    static class Q {
        int n;

        //start with inaccessible semaphore Consumer
        static Semaphore semCon = new Semaphore(0);
        static Semaphore semProd = new Semaphore(1);

        void get() {
            try {
                semCon.acquire();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception was catch.");
            }
            System.out.println("Received: " + n);
            semProd.release();
        }

        void put(int n) {
            try {
                semProd.acquire();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception was catch.");
            }
            this.n = n;
            System.out.println("Sent: " + n);
            semCon.release();
        }
    }

    static class Producer implements Runnable {
        Q q;

        Producer(Q q) {
            this.q = q;
            new Thread(this, "Producer").start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                q.put(i);
            }
        }
    }

    static class Consumer implements Runnable {
        Q q;

        Consumer(Q q) {
            this.q = q;
            new Thread(this, "Consumer").start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                q.get();
            }
        }
    }

}
