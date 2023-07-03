package com.qf.test;

import com.qf.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/18 11:15
 */
public class UserTest {

//    测试spring管理对象
    @Test
    public void testUser(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean(User.class);
        System.out.println(user);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
