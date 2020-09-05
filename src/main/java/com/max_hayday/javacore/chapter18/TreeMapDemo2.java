package com.max_hayday.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //create TreeMap
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
        //put elements in to tm
        tm.put("Djon Dou", new Double(3434.34));
        tm.put("Tom Smit", new Double(123.22));
        tm.put("Djayn Bejker", new Double(1378.34));
        tm.put("Tod Holl", new Double(99.22));
        tm.put("Ralf Smitt", new Double(-19.08));
        //get list elements of tm
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //show elements from tm
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //insert sum 1000 on Djon Dou balance
        double balance = tm.get("Djon Dou");
        tm.put("Djon Dou", balance + 1000);
        System.out.println("New balance of Djon Dou: " + tm.get("Djon Dou"));
    }
}

class TComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int i = str1.lastIndexOf(' '), j = str2.lastIndexOf(' '), k = str1.substring(i).compareTo(str2.substring(j));
        if (k == 0) //Last name is the same, check Name and LastName
            return str1.compareTo(str2);
        else
            return k;
    }
}
