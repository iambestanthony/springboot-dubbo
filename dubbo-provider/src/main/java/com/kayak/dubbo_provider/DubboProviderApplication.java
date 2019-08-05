package com.kayak.dubbo_provider;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_provider.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by JayJ on 2019/7/26.
 **/

@ImportResource("classpath:springContext.xml")
@MapperScan("com.kayak.dubbo_provider.mapper")
@SpringBootApplication
@EnableApolloConfig
public class DubboProviderApplication {

    public static void main(String[] args){

        SpringApplication.run(DubboProviderApplication.class,args);
    }
}
