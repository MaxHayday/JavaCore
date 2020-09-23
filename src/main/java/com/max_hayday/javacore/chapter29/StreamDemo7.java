package com.max_hayday.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        //List names,numbers and emails
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "larry@herbShild.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "james@herbShild.com"));
        myList.add(new NamePhoneEmail("Marry", "555-3333", "marry@herbShild.com"));
        //display only names and numbers on new data stream
        Stream<NamePhone> nameAndPhone = myList.stream().map(s -> new NamePhone(s.name, s.phone));
        //call method collect() to create list List with names and phones
        List<NamePhone> namePhoneList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Names and numbers  in list type List:");
        for (NamePhone e :
                namePhoneList) {
            System.out.println(e.name + ": " + e.phone);
        }
        //get different display of names and phones
        nameAndPhone = myList.stream().map(s -> new NamePhone(s.name, s.phone));

        //create set calling collect() method
        Set<NamePhone> set = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nNames and numbers in Set:");
        for (NamePhone e :
                set) {
            System.out.println(e.name + ": " + e.phone);
        }

    }
}
