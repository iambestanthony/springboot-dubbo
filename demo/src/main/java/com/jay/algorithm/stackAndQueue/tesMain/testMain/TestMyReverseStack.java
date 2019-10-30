package com.jay.algorithm.stackAndQueue.tesMain.testMain;

import com.jay.algorithm.stackAndQueue.MyReverseStack;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * Created by JayJ on 2019/10/27.
 **/
public class TestMyReverseStack {
    public static void main(String[] args){
        MyReverseStack reverseStack = new MyReverseStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Stream.of(stack).forEach(i -> System.out.print(i));
        reverseStack.reverse(stack);
        Stream.of(stack).forEach(i -> System.out.print(i));
    }
}
