package com.qf.test;

import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/19 19:49
 */
public class UserServiceTest {
    private ApplicationContext context;

    @Before
    public void setContext(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUserServiceAdd(){
        UserService userService= context.getBean(UserService.class);
        userService.addUser("zhaoliu");

    }
    @Test
    public void testUserServiceUpdate(){
        UserService userService= context.getBean(UserService.class);
        userService.updateUser("zhaoliu");

    }
}
