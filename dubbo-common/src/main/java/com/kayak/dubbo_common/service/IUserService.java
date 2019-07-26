package com.kayak.dubbo_common.service;

import com.kayak.dubbo_common.pojo.User;

import java.util.List;

/**
 * Created by JayJ on 2019/7/23.
 **/
public interface IUserService {
    User getUser(Integer id);
    String getUserNum();
    List<User> listUser();
}
