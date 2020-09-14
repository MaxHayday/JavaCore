package com.max_hayday.javacore.chapter15;

interface DoubleNumericArrayFunc{
    double func(double[] n)throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array is empty");
    }
}
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0,2.0,3.0,4.0};
        //In this lambda expression we calculate the average value from array with double types
        DoubleNumericArrayFunc average = (n)->{
            double sum = 0;
            if (n.length ==0)
                throw new EmptyArrayException();
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("Average value is " + average.func(values));
        //this line of code bing generate exception
        System.out.println("Average is " + average.func(new double[0]));
    }
}
