package com.max_hayday.javacore.chapter15;

interface MyFun<T> {
    int func(T[] vals, T v);
}

public class GenericMethodRefDemo {
    static <T> int myOp(MyFun<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }
    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs  = {"One","Two","Three","Two"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMatching,vals,4);
        System.out.println("Array vals contains " + count + " numbers 4");
        count = myOp(MyArrayOps::<String> countMatching,strs,"Two");
        System.out.println("Array strs contains " + count + " numbers two");
    }
}

class MyArrayOps {


    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) count++;
        }
        return count;
    }
}
