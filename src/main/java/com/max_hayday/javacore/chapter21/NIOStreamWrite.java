package com.max_hayday.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        //open file and get output stream
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))) {
            //output to the stream given amount bytes
            for (int i = 0; i < 26; i++) {
                fout.write('A' + i);
            }
        } catch (InvalidPathException e) {
            System.out.println("Error path file " + e);
        } catch (IOException e) {
            System.out.println("Error input-output: " + e);
        }
    }
}
