package com.kayak.consume_1.utils;

import com.kayak.consume_1.thread.MyThread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by JayJ on 2019/8/12.
 **/
public class TestCollection extends Thread{
    public  static int num = 1000;
    public static void main(String[] args){
        /*Collections:
            List:
                ArrayList:
                LinkedList:
                Vector:
            Set:
                SortedSet:
            Queue:
            Map:
                HashMap:
                Hashtable:
                WeakHashMap:*/
        int[] arr = new int[10000000];

        for (int i = 1; i < 10000000; i++) {
            arr[i-1] = 2*i-1;
        }
        //System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        /*for (int i = 0; i < arr.length; i++) {
              System.out.println("游标："+i);
        }*/
        //int byHalf = findByHalf(arr, 15555555);
        int byHalf = findByHalfRecursion(arr, 0, arr.length-1, 1555559);
        System.out.println(byHalf);
        long end = System.currentTimeMillis();
        System.out.println((end-start)+" ms");
        


    }

    public static int findByHalf(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        int halfPoint;
        while (start<=end){
            halfPoint = (end + start)/2;
            if (arr[halfPoint]==key){
                return halfPoint;
            }else {
                if (arr[halfPoint]<key){
                    start = halfPoint +1 ;
                }else {
                    end = halfPoint -1;
                }
            }

        }
        return -1;
    }

    public static int findByHalfRecursion(int[] arr,int left,int right,int key){

        int count =1 ;
        while (left <= right){
            int half = (left + right)/2;
            if (arr[half] == key){
                return half;
            }
            if (arr[half]<key){
                left = half+1;

            }else {
                right = half-1;
            }
            System.out.println(count++);
        }
        return -1;
    }

}
