package com.example.demo.redis;

import java.util.UUID;

/**
 * Created by JayJ on 2019/10/21.
 **/
public class MyRedisThread extends Thread {
    static int TICKET = 100;

    String name;
    RedisTools redisTools = new RedisTools();

    public MyRedisThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        UUID uuid = UUID.randomUUID();
        while (true) {
            if (redisTools.lock("TICKET", uuid.toString(), 100)) {
                if (TICKET > 0) {
                    System.out.println(name + " 用户订购的第 " + (101 - TICKET) + " 张票成功,还有 " + (TICKET - 1) + " 张余票");
                    TICKET--;
                } else {
                    System.out.println(name + " 用户订票失败，无余票");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    redisTools.unlock("TICKET", uuid.toString());
                }
                return;
            } else {
                if (TICKET <= 0)
                    return;
                //System.out.println("获取锁失败");
            }
        }
    }
}
