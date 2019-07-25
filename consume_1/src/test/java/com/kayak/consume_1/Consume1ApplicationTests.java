package com.kayak.consume_1;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_common.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
/*
@RunWith(SpringRunner.class)
@SpringBootTest*/
public class Consume1ApplicationTests {
    @Reference
    private static IUserService userService;



    /*@Test
	public void contextLoads() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo-consume_1.xml");
	    long timeStart = System.currentTimeMillis();
        User user = userService.getUser();
        System.out.println(user);
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行时间：" + (timeEnd - timeStart) + "ms");
    }*/
    public static void main(String[] args){
        //加载spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo-consume_1.xml");
        try {
            //线程休眠10分钟，保证测试启动后，dubbo服务可使用的时间
            //System.out.println(userService.getUser());
            Thread.sleep(10*60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
