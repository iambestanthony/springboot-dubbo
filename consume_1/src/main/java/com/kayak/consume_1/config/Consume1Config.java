package com.kayak.consume_1.config;

import com.kayak.consume_1.config.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by JayJ on 2019/7/25.
 **/
@Configuration
public class Consume1Config implements WebMvcConfigurer {
    @Autowired
    private UserInterceptor userInterceptor;

    //用这个方法配置静态资源如html、js、css等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    //用这个方法注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns("/**"); //表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(userInterceptor).addPathPatterns("/**").excludePathPatterns("/login", "/register");
        //super.addInterceptors(registry);    //较新Spring Boot的版本中这里可以直接去掉，否则会报错

    }
}
