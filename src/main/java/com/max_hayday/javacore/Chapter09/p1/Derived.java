package com.max_hayday.javacore.Chapter09.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Constructor of subclass");
        System.out.println("n = " + n );

        //available only for current class
        //System.out.println("n_pri = "4 + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
