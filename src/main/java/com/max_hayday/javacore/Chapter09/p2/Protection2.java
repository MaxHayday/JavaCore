package com.max_hayday.javacore.Chapter09.p2;

import com.max_hayday.javacore.Chapter09.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("constructor, which extends from another package");

        //available only for current class or package
        //System.out.println("n = " + n);

        //available only for current class
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
