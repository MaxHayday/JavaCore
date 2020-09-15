package com.max_hayday.javacore.chapter15;

//functional interface with method,which accept two references arguments and return logic value
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

//class for storing max temp for day
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    //return boolean true if object with type HighTemp have the same temp as object ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    //return boolean true if object with type HighTemp have less temp as object ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethodWithObjectRefDemo {
    //Method, which return quantity instance of object, was found by criteria from parameter MyFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v))
                count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
        //create array with HighTemp objects
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83),
        };
        //Use method counter() with array objects HighTemp type.
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Days, when was max temp 89: " + count);

        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13),
        };
        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Days,when max temp was 12: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Days,when max temp was 89: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Days,when max temp was less than 19: " + count);
    }
}





















