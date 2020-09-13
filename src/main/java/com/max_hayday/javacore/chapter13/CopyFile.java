package com.max_hayday.javacore.chapter13;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        //first check if is 2 names of files
        if (args.length != 2) {
            System.out.println("Using: CopyFile " + args[0] + " " + args[1]);
            return;
        }
        //copy file
        try {
            //try to open files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error input-output: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Error closing file input");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Error closing file output");
            }
        }
    }
}
