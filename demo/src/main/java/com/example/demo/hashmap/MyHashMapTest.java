package com.example.demo.hashmap;

import com.example.demo.redis.MyRedisThread;
import com.example.demo.redis.RedisTools;
import jdk.nashorn.internal.scripts.JD;
import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;

import java.util.Random;
import java.util.UUID;

/**
 * Created by JayJ on 2019/10/11.
 **/
public class MyHashMapTest {
    private volatile String NB_FIVE;
    public static void main(String[] args) throws InterruptedException {
        /**
         * collection array io generator => filter sort map collect
         */
//        Jedis jedis = new Jedis("localhost", 6379);
//        jedis.setnx("name", "abc");
//        jedis.expire("name", 2);
//        System.out.println(jedis.get("name"));
//        Thread.sleep(2000);
//        System.out.println(jedis.get("name"));
//        jedis.setnx("name", "TYT");
//        System.out.println(jedis.get("name"));

//        RedisTools redisTools = new RedisTools();
//
//        String value = UUID.randomUUID().toString();
//        boolean lock = redisTools.lock("lock", value, 200000);
//        System.out.println(lock);
//        Thread.sleep(5000);
//        redisTools.unlock("lock", value);

//        MyRedisThread thread1 = new MyRedisThread("张三");
//        MyRedisThread thread2 = new MyRedisThread("李四");
//        MyRedisThread thread3 = new MyRedisThread("王五");
//        MyRedisThread thread4 = new MyRedisThread("赵六");
//        MyRedisThread thread5 = new MyRedisThread("孙七");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
        for (int i = 0; i < 100; i++) {
            MyRedisThread thread = new MyRedisThread("客户—" + (i + 1));
            thread.start();
        }


    }
}