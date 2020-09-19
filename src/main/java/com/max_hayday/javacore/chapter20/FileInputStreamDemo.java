package com.max_hayday.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        //for automatic closing stream of input we use try with resources
        try (FileInputStream f = new FileInputStream("/home/max/Documents/FileInputStreamDemo.java")){
            System.out.println("All quantity available bytes: " + (size = f.available()));
            int n = size/40;
            System.out.println("First " + n + " bytes, " + "reads from file with method read()");
            for(int i = 0;i<n; i++){
                System.out.print(f.read());
            }
            System.out.println("\nStill available:" + f.available());
            System.out.println("Reading next " + n + " bytes using method read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n){
                System.err.println("Can not read " + n/2 + " bytes.");
            }
            System.out.println(new String(b,0,n));
            System.out.println("\nStill available: " + (size = f.available()));
            System.out.println("Skip half available bytes using method skip()");
            f.skip(size/2);
            System.out.println("Still available: " + f.available());
            if (f.read(b,n/2,n/2) != n/2){
                System.err.println("Can not read " + n/2 + " bytes.");
            }
            System.out.println(new String(b,0,b.length));
            System.out.println("\nStill available: " + f.available());
        }catch (IOException e){
            System.out.println("Error input-output: " + e);
        }
    }
}
