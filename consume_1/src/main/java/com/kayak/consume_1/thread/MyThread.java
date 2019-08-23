package com.kayak.consume_1.thread;

/**
 * Created by JayJ on 2019/8/14.
 **/
public class MyThread extends Thread{

    private static int a = 0;
    private static int b = 1000;
    private int num;
    public MyThread(int num){
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            num--;
            System.out.println(currentThread().getName()+"thread_"+(i+1));
        }
    }
}
