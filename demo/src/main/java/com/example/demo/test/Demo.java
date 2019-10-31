package com.example.demo.test;

/**
 * Created by JayJ on 2019/9/16.
 **/
public class Demo {
    public static void main(String[] args){
        KV<Integer, String> kv = new KV<Integer, String>(1, "string_1");
        Integer k = kv.getK();
        System.out.println(k);

    }
}
