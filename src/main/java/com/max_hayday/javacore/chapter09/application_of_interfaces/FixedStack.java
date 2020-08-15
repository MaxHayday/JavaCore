package com.max_hayday.javacore.chapter09.application_of_interfaces;

public class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    //allocate memory and initialize the stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //put element in stack
    @Override
    public void push(int item) {
        if (tos == stck.length - 1)//use length of stack
            System.out.println("Stack is full.");
        else stck[++tos] = item;
    }

    //take element from stack
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is not loaded.");
            return 0;
        } else
            return stck[tos--];
    }
}
