package com.example.demo.redis;

import redis.clients.jedis.Jedis;

import java.util.Collections;

/**
 * Created by JayJ on 2019/10/21.
 **/
public class RedisTools {

    private static final String NX = "NX";
    private static final String EXPX = "PX";
    private static final String COMFIRM_RESULT = "OK";
    private static final Long RELEASE_SUCCESS = 1L;

    private Jedis jedis = new Jedis("localhost", 6379);

    public boolean lock(String key ,String value ,long time) {
        String result = jedis.set(key, value, NX, EXPX, time);
        //System.out.println("结果：" + result);
        if(COMFIRM_RESULT.equalsIgnoreCase(result))
            return true;
        return false;
    }

    public boolean unlock(String key, String value) {
        //使用lua代码操作redis
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(key), Collections.singletonList(value));

        if (RELEASE_SUCCESS.equals(result)) {
            //System.out.println("解锁成功");
            return true;
        }
        //System.out.println("解锁失败");
        return false;
    }
}
