package com.max_hayday.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
        int c;
        //create socket connection with internic.net web-site
        //using port 43
        Socket s = new Socket("whois.internic.net", 43);
        //get input-output stream
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();
        //form a query string
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        //convert string to bytes
        byte buf[] = str.getBytes();
        //send request
        outputStream.write(buf);
        //read response and display it
        while ((c = inputStream.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
