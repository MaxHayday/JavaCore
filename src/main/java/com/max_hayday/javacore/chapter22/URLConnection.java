package com.max_hayday.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

public class URLConnection {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        java.net.URLConnection hpCon = hp.openConnection();
        //get date
        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("Information about date does not available");
        else System.out.println("Date: " + new Date(d));

        //get content type
        System.out.println("Type of content: " + hpCon.getContentType());

        //get resource expiration date
        d = hpCon.getExpiration();
        if (d == 0)
            System.out.println("Information about resource expiration date does not exist");
        else System.out.println("Resource expiration date: " + new Date(d));

        //get date when was the last modification
        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println("Information about last modification.");
        else System.out.println("Date of last modification: " + new Date(d));

        //ger length of content
        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Length of content is not available");
        else System.out.println("Length of content: " + len);
        if (len != 0) {
            System.out.println("=== Content ===");
            InputStream inputStream = hpCon.getInputStream();
            while (((c = inputStream.read()) != -1)) {
                System.out.print((char) c);
            }
            inputStream.close();
        } else System.out.println("Content is not available");
    }
}
