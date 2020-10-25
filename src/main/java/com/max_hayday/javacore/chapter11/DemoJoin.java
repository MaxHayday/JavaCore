package com.max_hayday.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread ONE is run: " + ob1.t.isAlive());
        System.out.println("Thread TWO is run: " + ob2.t.isAlive());
        System.out.println("Thread THREE is run: " + ob3.t.isAlive());


        //waiting for finished threads for execution
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
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
                System.out.println(name + " is interrupted.");
            }
            System.out.println(name + " is finished.");
        }
    }
}
