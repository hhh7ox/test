package com.qf.service.impl;

import com.qf.mapper.UserMapper;
import com.qf.pojo.TbUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * create by hhh7ox on 2022/5/19 17:23
 */

@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public TbUser findUserById(Long id) {
        return userMapper.selectUserById(id);
    }

    @Override
    @Transactional
    public void addUser(TbUser tbUser) {
        userMapper.addUser(tbUser);
    }
}
