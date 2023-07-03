package com.qf.test;

import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/19 11:01
 * AOP 测试
 */
public class UserServiceTest {

    @Test
    public void testUserServiceByTranAdvice(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.addUser("zhangsan");
        System.out.println(userService.modifyUser("lisi"));
    }

    @Test
    public void testUserServiceByInterAdvice(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        String result = userService.modifyUser("wangwu");
        userService.addUser("zhaoliu");


    }
}
