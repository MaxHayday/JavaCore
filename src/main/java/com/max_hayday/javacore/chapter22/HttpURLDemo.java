package com.max_hayday.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        //display method of request
        System.out.println("Method of request: " + hpCon.getRequestMethod());

        //display code of response
        System.out.println("Response code: " + hpCon.getResponseCode());

        //display response message
        System.out.println("Response message: " + hpCon.getResponseMessage());

        //get a list of fields and lots of keys from the header
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nNext comes the heading:");
        //display all keys and values from header
        for (String k :
                hdrField) {
            System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
        }
    }
}
