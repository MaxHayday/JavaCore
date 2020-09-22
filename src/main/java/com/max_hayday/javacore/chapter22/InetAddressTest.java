package com.max_hayday.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);
        InetAddress[] inetAddress = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < inetAddress.length; i++) {
            System.out.println(inetAddress[i]);

        }
    }
}
