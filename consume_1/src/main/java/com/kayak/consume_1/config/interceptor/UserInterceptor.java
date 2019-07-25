package com.kayak.consume_1.config.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by JayJ on 2019/7/25.
 **/
@Component
public class UserInterceptor implements HandlerInterceptor {
    //访问接口前执行此方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        request.setAttribute("startTime",System.currentTimeMillis());
        return true;//true 放行 false 忽略当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        long endTime = System.currentTimeMillis();
        long userTime = endTime - (long)request.getAttribute("startTime");
        System.out.println("本次执行 " + request.getRequestURI()+" 用时：" + userTime + "ms");
    }
}
