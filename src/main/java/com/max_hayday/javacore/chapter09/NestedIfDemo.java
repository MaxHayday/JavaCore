package com.max_hayday.javacore.chapter09;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("Number 10 is positive");
        if (nif.isNotNegative(-12))
            System.out.println("This won`t be seen");
    }
}

class A {
    //this is nested interface
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

//class B implements nested interface
class B implements A.NestedIf {

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
