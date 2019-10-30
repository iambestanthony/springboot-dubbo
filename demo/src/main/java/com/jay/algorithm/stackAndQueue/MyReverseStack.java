package com.jay.algorithm.stackAndQueue;

import java.util.Stack;

/**
 * Created by JayJ on 2019/10/27.
 **/
public class MyReverseStack {
    public Stack<Integer> stackData;

    public MyReverseStack() {
        stackData = new Stack<Integer>();
    }

    public void push(int newNum) {
        stackData.push(newNum);
    }

    public int peek() {
        return stackData.peek();
    }

    public int getAndRemoveLastElement(Stack<Integer> stackData) {
        int result = stackData.pop();
        if (stackData.isEmpty())
            return result;
        int element = getAndRemoveLastElement(stackData);
        stackData.push(result);
        
        return element;
    }

    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(last);
    }

    public int pop() {
        return stackData.pop();
    }

}
