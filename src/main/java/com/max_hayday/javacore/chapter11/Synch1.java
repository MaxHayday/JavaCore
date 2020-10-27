package com.max_hayday.javacore.chapter11;

public class Synch1 {
    static class Callme {
        void call(String msg) {
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
            }
            System.out.println("]");
        }
    }

    static class Caller implements Runnable {
        String msg;
        Callme target;
        Thread t;

        public Caller(Callme target, String msg) {
            this.target = target;
            this.msg = msg;
            t = new Thread(this);
            t.start();
        }

        //synchronized call method call()
        @Override
        public void run() {
            synchronized (target) {  //synchronized block
                target.call(msg);
            }
        }
    }

    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Welkome");
        Caller ob2 = new Caller(target, "in synchronized");
        Caller ob3 = new Caller(target, "world!");

        //waiting for finish thread of execution
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }

    }
}
