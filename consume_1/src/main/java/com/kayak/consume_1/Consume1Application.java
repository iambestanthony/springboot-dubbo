package com.kayak.consume_1;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Controller
@RequestMapping("/consume")
@SpringBootApplication
@ImportResource("classpath:dubbo-consume_1.xml")
public class Consume1Application {
    @Autowired
    public IUserService userService;



    public static void main(String[] args) {
        SpringApplication ctx = new SpringApplication(Consume1Application.class);
		SpringApplication.run(Consume1Application.class, args);
	}
	@RequestMapping("/getInfo")
    @ResponseBody
	public User testInfoGet(Integer id){
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo-consume_1.xml");*/
        long timeStart = System.currentTimeMillis();
        User user = userService.getUser(id);
        System.out.println(user);
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行时间：" + (timeEnd - timeStart) + "ms");
        return user;
    }
    @RequestMapping("/listUser")
    @ResponseBody
    public List<User> listUser(){
        return userService.listUser();
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(){
	    return "hello dubbo";
    }

}
