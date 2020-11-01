package com.max_hayday.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }

    //Thread forming symbolic string
    static class MakeString implements Runnable {
        Exchanger<String> ex;
        String str;

        MakeString(Exchanger<String> c) {
            ex = c;
            str = new String();
            new Thread(this).start();
        }

        @Override
        public void run() {
            char ch = 'A';
            for (int i = 0; i < 3; i++) {
                //fill buffer
                for (int j = 0; j < 5; j++)
                    str += ch++;
                try {
                    //filled buffer to empty
                    str = ex.exchange(str);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    //Thread using symbolic string
    static class UseString implements Runnable {
        Exchanger<String> ex;
        String str;

        UseString(Exchanger<String> c) {
            ex = c;
            new Thread(this).start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    //change empty buffer to filled
                    str = ex.exchange(new String());
                    System.out.println("Received: " + str);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
