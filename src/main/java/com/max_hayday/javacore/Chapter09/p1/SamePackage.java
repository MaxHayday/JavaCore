package com.max_hayday.javacore.Chapter09.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("constructor of the same package");
        System.out.println("n = " + p.n);

        //available only for current class
        //System.out.println("n_pri = " + p.pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
