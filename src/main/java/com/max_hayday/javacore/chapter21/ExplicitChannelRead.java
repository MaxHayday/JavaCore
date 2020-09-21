package com.max_hayday.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;
        //first get the path to the file
        try {
            filePath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }
        //after get channel to this file in bloc operator try with resources
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)) {
            //allocate memory for a buffer
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                //read date from file in to the buffer
                count = fChan.read(mBuf);
                //stop reading when end of file is reached
                if (count != -1) {
                    //prepare the buffer to read date from it
                    mBuf.rewind();
                    //read data bytes from buffer and display them as symbols
                    for (int i = 0; i < count; i++) {
                        System.out.print(mBuf.get());
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            System.out.println("Error input-output " + e);
        }
    }
}
