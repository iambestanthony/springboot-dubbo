package com.kayak.dubbo_provider;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_common.service.IUserService;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.UUID;

/**
 * Created by JayJ on 2019/7/23.
 **/
@Path("/user")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser() {
        return new User("admin","admin","N201907240929");
    }
    @GET
    @Path("/getUserNum")
    @Override
    public String getUserNum() {
        return UUID.randomUUID().toString();
    }

}
