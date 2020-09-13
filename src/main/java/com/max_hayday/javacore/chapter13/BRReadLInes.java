package com.max_hayday.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLInes {
    public static void main(String[] args) throws IOException {
        //create input stream BufferedReader type,using standard input stream System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        System.out.println("Insert text strings.");
        System.out.println("Insert 'stop' to exit.");
        do {
            str = br.readLine();
            System.out.print(str);
        }while (!str.equals("stop"));
    }
}
