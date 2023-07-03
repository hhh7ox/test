package com.qf.springproxy.service.impl;

import com.qf.springproxy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * create by hhh7ox on 2022/5/18 17:31
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String name) {
        System.out.println("添加了用户: "+name);
    }

    @Override
    public String modifyUser(String name) {
        return "更新了用户: "+name;
    }
}
