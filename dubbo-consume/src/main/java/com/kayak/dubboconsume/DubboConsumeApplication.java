package com.kayak.dubboconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consume.xml")
public class DubboConsumeApplication {


	public static void main(String[] args) {
        SpringApplication.run(DubboConsumeApplication.class,args);
	}

}
