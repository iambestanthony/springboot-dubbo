package com.kayak.dubbo_provider.mapper;

import com.kayak.dubbo_common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by JayJ on 2019/7/26.
 **/
@Mapper
public interface UserMapper {
    User getUser(Integer id);
    List<User> listUser();
}
