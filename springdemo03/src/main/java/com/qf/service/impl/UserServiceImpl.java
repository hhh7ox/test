package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * create by hhh7ox on 2022/5/18 16:48
 */

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    @Autowired
//    @Qualifier("userDaoImpl2")
    @Resource(name = "userDaoImpl2")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.insertUser();
    }
}
