package com.jay.algorithm.stackAndQueue.tesMain.testMain;

import com.jay.algorithm.stackAndQueue.MyStack;

/**
 * Created by JayJ on 2019/10/25.
 **/
public class TestMyStack {

    public static void main(String[] args){
        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(1);
        System.out.println("getMin: "+myStack.getMin());
        System.out.println("pop "+myStack.pop());
        System.out.println("pop "+myStack.pop());
        System.out.println("pop "+myStack.pop());
        System.out.println("pop "+myStack.pop());
        System.out.println("pop "+myStack.pop());
        System.out.println("pop "+myStack.pop());

    }
}
