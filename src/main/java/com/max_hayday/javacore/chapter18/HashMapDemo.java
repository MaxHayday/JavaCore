package com.max_hayday.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //create hash-map
        HashMap<String,Double> hm = new HashMap<>();

        //insert elements in to hash-map
        hm.put("Djon Dou",new Double(3434.34));
        hm.put("Tom Smit",new Double(123.22));
        hm.put("Djayn Bejker",new Double(1378.34));
        hm.put("Tod Holl",new Double(99.22));
        hm.put("Ralf Smitt",new Double(-19.08));

        //get lots of records
        Set<Map.Entry<String,Double>> set = hm.entrySet();

        //display a lot of records
        for (Map.Entry<String,Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //insert 1000 on Djon Dou balance
        double balance = hm.get("Djon Dou");
        hm.put("Djon Dou", balance + 1000);
        System.out.println("New balance of Djon Dou: " + hm.get("Djon Dou"));

    }
}
