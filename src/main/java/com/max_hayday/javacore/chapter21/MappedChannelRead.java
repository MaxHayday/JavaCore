package com.max_hayday.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        //get channel to the file in bloc operator try with resources
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            //ger size of file
            long fSize = fChan.size();
            //map file to buffer
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            //read bytes from buffer and display them
            for (int i = 0; i < fSize; i++) {
                System.out.print(mBuf.get());
            }
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Error path file " + e);
        } catch (IOException e) {
            System.out.println("Error input-output " + e);
        }
    }
}
