package com.qf.dao.impl;

import com.qf.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * create by hhh7ox on 2022/5/18 16:47
 */

@Repository
public class UserDaoImpl2 implements UserDao {
    @Override
    public void insertUser() {
        System.out.println("添加了user2");
    }
}
