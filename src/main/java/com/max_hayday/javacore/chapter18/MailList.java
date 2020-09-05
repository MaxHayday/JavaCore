package com.max_hayday.javacore.chapter18;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<Address>();
    //add elements ta LinkedList
        m1.add(new Address("J.W. West ","11 Oak Ave"," Urbana","IL","61801"));
        m1.add(new Address("Ralph Baker","1142 Maple Lane"," Mahomet","IL","61853"));
        m1.add(new Address("Tom Carlon","867 Elm St","Chamaign","IL","61820"));
        //Show list of posts addresses
        for (Address element : m1){
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
