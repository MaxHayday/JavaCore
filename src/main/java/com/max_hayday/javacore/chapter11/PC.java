package com.max_hayday.javacore.chapter11;


public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("For stop push Ctrl-C.");
    }


    static class Q {
        int n;
        boolean valueSet = false;

        synchronized int get() {
            while (!valueSet)
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception is catch.");
                }
            System.out.println("Received: " + n);
            valueSet = false;
            notify();
            return n;
        }

        synchronized void put(int n) {
            this.n = n;
            System.out.println("Sent: " + n);
        }
    }

    static class Producer implements Runnable {
        Q q;

        public Producer(Q q) {
            this.q = q;
            new Thread(this, "producer").start();
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                q.put(i++);
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
            while (true) {
                q.get();
            }
        }
    }
}
