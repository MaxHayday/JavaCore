package com.max_hayday.javacore.chapter10;

public class ChainExcDemo {
static void demopeoc(){
    //create exception
    NullPointerException e = new NullPointerException("high level");
    //add cause of exception
    e.initCause(new ArithmeticException("cause"));
    throw e;
}

    public static void main(String[] args) {
        try {
            demopeoc();
        }catch (NullPointerException e){
            //show exception of high level
            System.out.println("Catch exception: " + e);
            // show exception which was causes of exception high level
            System.out.println("First cause: " + e.getCause());

        }
    }
}
