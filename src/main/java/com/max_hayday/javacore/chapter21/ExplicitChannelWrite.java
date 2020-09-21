package com.max_hayday.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        //ger channel to the file in bloc try with resources
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            //create buffer
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            //write several bytes in buffer
            for (int i = 0; i < 26; i++) {
                byteBuffer.put((byte) ('A' + i));
            }
            //prepare buffer to write data
            byteBuffer.rewind();
            //write data from buffer to the file
            fileChannel.write(byteBuffer);
        } catch (InvalidPathException e) {
            System.out.println("Error path file " + e);
        } catch (IOException e) {
            System.out.println("Error input-output " + e);
        }
    }
}
