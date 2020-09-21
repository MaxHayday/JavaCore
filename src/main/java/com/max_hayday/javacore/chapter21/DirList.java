package com.max_hayday.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/home";
        //get and process directory input stream in bloc operator try
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Directory " + dirname);
            //Class DirectoryStream implement interface Iterable,so for displaying directory contents we use fot each
            for (Path entry : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else System.out.print("    ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("error path to the file " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " isnt directory");
        } catch (IOException e) {
            System.out.println("Error input-output: " + e);
        }
    }
}
