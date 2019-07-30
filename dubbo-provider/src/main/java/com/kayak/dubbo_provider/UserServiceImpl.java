package com.kayak.dubbo_provider;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_common.service.IUserService;
import com.kayak.dubbo_provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;
import java.util.UUID;

/**
 * Created by JayJ on 2019/7/23.
 **/
@Path("/user")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${driverClassName}")
    private String driverClassName;

    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }
    @GET
    @Path("/getUserNum")
    @Override
    public String getUserNum() {
        return UUID.randomUUID().toString();
    }

    @Override
    public List<User> listUser() {
        //测试apollo配置中心
        System.out.println("获取apollo配置：user【" + url + "】. username【" + username + "】. password【" + password + "】. driverClassName【" + driverClassName + "】");
        return userMapper.listUser();
    }

}
