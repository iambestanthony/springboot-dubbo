package com.kayak.dubboconsume.controller;

import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_common.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by JayJ on 2019/7/24.
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    //登陆
    /*@RequestMapping(value = "/dologin",method = RequestMethod.POST)
    public String dologin(User user, HttpSession session){
        User u = userService.getUser();
        if (u!=null){//登陆失败
            session.setAttribute("session_user",u);
            return "index";
        }else {//登陆成功
            return "login";
        }
    }*/

}
