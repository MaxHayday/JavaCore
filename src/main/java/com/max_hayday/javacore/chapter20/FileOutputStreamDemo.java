package com.max_hayday.javacore.chapter20;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        byte buf[] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");
            //write data in first file
            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            //write data in second file
            f1.write(buf);
            //write data in third file
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        }catch (IOException e){
            System.out.println("Error input-output");
        }finally {
            try {
                if (f0 != null) f0.close();
            }catch (IOException e){
                System.out.println("Error close file file1.txt");
            }
            try {
                if (f1 != null)f1.close();
            }catch (IOException e){
                System.out.println("Error close file file2.txt");
            }
            try {
                if (f2 != null)f1.close();
            }catch (IOException e){
                System.out.println("Error close file file3.txt");
            }
        }
    }
}
