package com.max_hayday.javacore.chapter15;

interface SomeFunc<T>{
    T func(T f);
}
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //use string example of interface SomeFunc
        SomeFunc<String> reverse = n ->{
          String result = "";
          int i;
          for (i = n.length()-1; i >= 0; i--){
              result += n.charAt(i);
          }
          return result;
        };
        System.out.println("Lambda addressed to "+reverse.func("Lambda"));
        System.out.println("Expression addressed to " + reverse.func("Expression"));
        //now use int in interface SomeFunc
        SomeFunc<Integer> factorial = (n)->{
            int res = 1;
            for (int i = 1; i <=n; i++)
                res *= i;
                return res;

        };
        System.out.println("Factorial number 3 is " + factorial.func(3));
        System.out.println("Factorial number 5 is " + factorial.func(5));

    }
}
