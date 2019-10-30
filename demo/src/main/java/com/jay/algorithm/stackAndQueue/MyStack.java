package com.jay.algorithm.stackAndQueue;

import java.util.Stack;

/**
 * Created by JayJ on 2019/10/25.
 **/
public class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (stackMin.empty()) {
            stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (stackData.empty()) {
            throw new RuntimeException("stack is empty.");
        } else if (stackData.peek().equals(getMin())) {
            stackMin.pop();
        }
        return stackData.pop();
    }

    public Integer getMin() {
        if (stackMin.empty())
            throw new RuntimeException("stack is empty.");
        return stackMin.peek();
    }

}
