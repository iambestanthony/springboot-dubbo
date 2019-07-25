package com.kayak.dubboconsume;


import com.alibaba.dubbo.config.annotation.Reference;
import com.kayak.dubbo_common.pojo.User;
import com.kayak.dubbo_common.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:dubbo-consume.xml")
public class consumeTest
{
    /**
     * Rigorous Test :-)
     */
    @Reference
    private IUserService userService;
    @Test
    public void testSay()
    {
        User user = userService.getUser();
        System.out.println(user);
    }

}
