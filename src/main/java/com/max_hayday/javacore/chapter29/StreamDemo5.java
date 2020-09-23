package com.max_hayday.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //list names,phones and emails
        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Larry", "555-5555", "larry@herbShild.com"));
        list.add(new NamePhoneEmail("James", "555-4444", "james@herbShild.com"));
        list.add(new NamePhoneEmail("Marry", "555-3333", "marry@herbShild.com"));

        System.out.println("Basic elements from list list: ");
        list.stream().forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));
        System.out.println();

        //display on new stream only name and phone
        Stream<NamePhone> nameAndPhone = list.stream().map(a -> new NamePhone(a.name, a.phone));
        System.out.println("List names and numbers: ");
        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phone));
    }
}

class NamePhoneEmail {
    String name;
    String phone;
    String email;

    public NamePhoneEmail(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
