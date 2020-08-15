package com.max_hayday.javacore.Chapter09.p2;

import com.max_hayday.javacore.Chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("constructor from another package");

        //available only for current class or package
        //System.out.println("n = " + p.n);

        //available only for current class
        //System.out.println("n_pri = " + p.n_pri);

        //available only for current class or subclass or package
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
