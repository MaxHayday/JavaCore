package com.max_hayday.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;
        //Here channel is opening for path, returned of method Paths.get() like object Path type.
        //Variable filepath is no needed
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))) {
            //allocate memory fot a buffer
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                //read data from file to buffer
                count = fChan.read(mBuf);
                //stop reading when end of file is reached
                if (count != -1) {
                    //prepare buffer to reading data from it
                    mBuf.rewind();
                    //read data bytes from buffer and display them like symbols
                    for (int i = 0; i < count; i++) {
                        System.out.print(mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Error of file path " + e);
        } catch (IOException e) {
            System.out.println("Error input-output " + e);
        }
    }
}
