package com.jay.algorithm.stackAndQueue.tesMain.testMain;

import com.jay.algorithm.stackAndQueue.TwoStackQueue;

/**
 * Created by JayJ on 2019/10/26.
 **/
public class TestTwoStackQueue {
    public static void main(String[] args){
        TwoStackQueue queue = new TwoStackQueue();
        queue.add(1);
        System.out.println(queue.peek());
        queue.add(2);
        System.out.println(queue.peek());
        queue.add(3);
        System.out.println(queue.peek());
        queue.add(4);
        System.out.println(queue.peek());
        queue.add(5);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
