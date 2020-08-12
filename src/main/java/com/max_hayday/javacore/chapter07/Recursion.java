package com.max_hayday.javacore.chapter07;

public class Recursion {
    public static void main(String[] args) {
        Factorial1 f = new Factorial1();
        System.out.println("Factorial 3 is " + f.fact(3));
        System.out.println("Factorial 4 is " + f.fact(4));
        System.out.println("Factorial 5 is " + f.fact(5));
    }

    static class Factorial1 {
        int fact(int n) {
            int result;
            if (n == 1) return 1;
            result = fact(n - 1) * n;
            return result;
        }
    }
}
