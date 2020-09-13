package com.max_hayday.javacore.chapter13;

public class NativeDemo {
    int i;
    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("variable ab.i before calling native method:" + ob.i);
        ob.test();//call native method
        System.out.println("variable ab.i after calling native method:" + ob.i);
    }
    //declare native method
    public native void test();
    //download library DLL,which contains static method
    static {
        System.loadLibrary("NativeDemo");
    }
}
