package com.max_hayday.javacore.chapter15;

interface StringFunc {
    String func(String n);
}

public class LambdaAsArgumentsDemo {
    //First parameter of this method has functional interface type.
    //We can send him reference on all instances of this interface,include
    //instance created in lambda expression.Second parameter designate processed symbols string
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions increase efficiency Java";
        String outStr;
        System.out.println("This is the original string: " + inStr);
        //Below is the simple lambda expression,changed in to the upper case all
        // symbols from basic string and put in to the argument
        //in method stringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("This string is an upper case: " + outStr);

        //Here is transmitted block of lambda expression, which remove gaps from origin string
        outStr = stringOp((str) -> {
            String res = "";
            int i;
            for (int j = 0; j < str.length(); j++)
                if (str.charAt(j) != ' ')
                    res += str.charAt(j);
            return res;

        }, inStr);
        System.out.println("This string with removed gaps: " + outStr);
        //Of course, we can transmit instance of interface StringFunc,
        //created in previous lambda expression.For example, after next declaration reference  revers is make on interface instance
        //SrtringFunc
        StringFunc reverse = (str)->{
            String res = "";
            int i;
            for (int j = str.length()-1; j >= 0 ; j--) {
                res += str.charAt(j);
            }
            return res;
        };
        //And now reference revers we can transmit like first parameter in method stringOp()
        System.out.println("It`s revers string: " + stringOp(reverse,inStr));

    }
}
