package com.qf.test;

import com.qf.pojo.TbUser;
import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/19 18:49
 */
public class UserMapperTest {
    private ApplicationContext context;

    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUserMapperSelect(){
        UserService userService = context.getBean(UserService.class);
        TbUser tbUser = userService.findUserById(2L);
        System.out.println(tbUser);
    }

    @Test
    public void testUserMapperInsert(){
        UserService userService = context.getBean(UserService.class);
        TbUser tbUser = new TbUser(0L,"zhangzhang","zhangzhang","zhang@zhang.com","男",1L,1L,"11111");
        userService.addUser(tbUser);
    }
}
