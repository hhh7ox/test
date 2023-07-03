package com.qf.service.impl;

import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * create by hhh7ox on 2022/5/19 19:27
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String name) {
        System.out.println("添加了用户: "+name);
    }

    @Override
    public String updateUser(String name) {
        System.out.println("更新了用户信息:"+name);
        return "更新完成";
    }
}
