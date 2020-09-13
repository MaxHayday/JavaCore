package com.max_hayday.javacore.chapter13;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        //check if name of file is available
        if (args.length != 1) {
            System.out.println("Using: ShowFile " );
            return;
        }
        //try to open file
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Can not open file");
            return;
        }
        //file is open and ready for reading
        //Next we will read symbols to the end of file
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print(i);
            } while (i != -1);
        } catch (IIOException e) {
            System.out.println("Error in reading file");
        }
        //close file
        try {
            fin.close();
        } catch (IIOException e) {
            System.out.println("Error to close file");
        }
    }
}
