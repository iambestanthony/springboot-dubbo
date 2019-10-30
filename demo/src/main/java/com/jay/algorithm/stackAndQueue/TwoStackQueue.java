package com.jay.algorithm.stackAndQueue;

import java.util.Stack;

/**
 * Created by JayJ on 2019/10/26.
 **/
public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int newNum) {
        stackPush.push(newNum);
        pushToPop();
    }

    private void pushToPop() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public int poll() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.peek();
    }
}
