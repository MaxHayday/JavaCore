package com.max_hayday.javacore.chapter21;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("/home/max/IdeaProjects/JavaCore/example/test.txt");
        System.out.println("Name of file: " + filePath.getName(5));
        System.out.println("Path to file: " + filePath);
        System.out.println("Absolute path to the file: " + filePath.toAbsolutePath());
        System.out.println("Parent directory: " + filePath.getParent());
        if (Files.exists(filePath)) {
            System.out.println("File is exist");
        } else {
            System.out.println("File isn`t exist");
        }
        try {
            if (Files.isHidden(filePath))
                System.out.println("File is hidden");
            else System.out.println("File isn`t hidden");
        } catch (IOException e) {
            System.out.println("Error input-output: " + e);
        }
        Files.isWritable(filePath);
        System.out.println("File is available for recording");
        Files.isReadable(filePath);
        System.out.println("File is available for reading");
        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            if (attributes.isDirectory())
                System.out.println("Its directory");
            else System.out.println("It is not a directory");
            if (attributes.isRegularFile())
                System.out.println("It is simple file");
            else System.out.println("It is not a simple file");
            if (attributes.isSymbolicLink())
                System.out.println("It is a symbolic link");
            else
                System.out.println("It is not a symbolic link");
            System.out.println("Date when file was changed: " + attributes.lastModifiedTime());
            System.out.println("Size of file: " + attributes.size() + " bytes");
        } catch (IOException e) {
            System.out.println("Attribute reading error: " + e);
        }
    }
}
