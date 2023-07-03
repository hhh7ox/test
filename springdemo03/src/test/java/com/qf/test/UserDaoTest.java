package com.qf.test;

import com.qf.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/18 16:31
 * Spring 注解
 */
public class UserDaoTest {
    private ApplicationContext context;

    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUserDao(){
        UserService userService = context.getBean(UserService.class);
        userService.addUser();

    }
}
