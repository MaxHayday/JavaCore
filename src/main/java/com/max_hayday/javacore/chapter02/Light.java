package com.max_hayday.javacore.chapter02;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days, seconds, distance;
        //light speed mil in sec
        lightspeed = 186000;
        days = 1000; //indicate the number of days

        seconds = days * 24 * 60 * 60;  // convert in sec
        distance = lightspeed * seconds; //find distance;

        System.out.print("For " + days);
        System.out.print(" days light will go near ");
        System.out.println(distance + " mil.");
    }

}
