package com.max_hayday.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File file, String s) {
        return s.endsWith(ext);
    }

}
public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "/home/max/Documents/java";
        File f = new File(dirName);
        FilenameFilter only = new OnlyExt("html");

        String[] s = f.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

}



