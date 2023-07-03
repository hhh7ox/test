package com.qf.test;

import com.qf.UserService;
import com.qf.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/17 21:38
 */
public class TestUserService {
    @Test
    public void testAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();
        System.out.println("-----------------");
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        userServiceImpl.addUser();
        System.out.println("-----------------");
        UserService userService1 = context.getBean(UserServiceImpl.class);
        userService1.addUser();
    }
}
