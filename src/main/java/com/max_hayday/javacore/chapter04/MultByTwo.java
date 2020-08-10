package com.max_hayday.javacore.chapter04;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFF_FFFE;
        System.out.println(num);
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
