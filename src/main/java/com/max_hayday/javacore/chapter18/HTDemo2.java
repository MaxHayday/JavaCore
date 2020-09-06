package com.max_hayday.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;
        balance.put("Djon Dou", new Double(3434.34));
        balance.put("Tom Smit", new Double(123.22));
        balance.put("Djayn Bejker", new Double(1378.34));
        balance.put("Tod Holl", new Double(99.22));
        balance.put("Ralf Smitt", new Double(-19.08));

        //print all balances from hash-table
        Set<String> set = balance.keySet();

        //get iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        //put sum 1000 on Djon Dou balance
        bal = balance.get("Djon Dou");
        balance.put("Djon Dou", bal + 1000);
        System.out.println("New balance of Djon Dou account: " + balance.get("Djon Dou"));
    }
}
