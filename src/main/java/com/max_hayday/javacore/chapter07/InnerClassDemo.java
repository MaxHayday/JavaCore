package com.max_hayday.javacore.chapter07;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        public void display() {
            System.out.println("Output: outer_x = " + outer_x);
        }
    }
}
