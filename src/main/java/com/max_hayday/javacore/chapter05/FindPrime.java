package com.max_hayday.javacore.chapter05;

public class FindPrime {
    public static void main(String[] args) {
        int num = 214;
        boolean isPrime;
        if (num < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i <= num / i; i++) {
            System.out.println(num % i);
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Simple number");
        else System.out.println("Not simple number");
    }
}
