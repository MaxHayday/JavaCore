package com.max_hayday.javacore.chapter15;

//functional interface with method strRevers()
//interface StringFunc{
//    String func(String n);
//}
class MyStringOps {
    static String strRevers(String str) {
        String result = "";
        int i;
        for (int j = str.length() - 1; j >= 0; j--) {
            result += str.charAt(j);
        }
        return result;
    }
}

public class MethodRefDemo {
    static String stringOp(StringFunc sf , String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambda expressions increase efficiency Java";
        String outStr;

        outStr = stringOp(MyStringOps::strRevers,inStr);
        System.out.println("Original string: "+ inStr);
        System.out.println("Changed string: " + outStr);
    }
}
