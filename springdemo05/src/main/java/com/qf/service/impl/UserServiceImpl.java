package com.qf.service.impl;

import com.qf.service.UserService;

/**
 * create by hhh7ox on 2022/5/19 10:54
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String name) {
        System.out.println("添加了用户: "+name);
    }

    @Override
    public String modifyUser(String name) {
        return "修改了用户: " + name;
    }
}
