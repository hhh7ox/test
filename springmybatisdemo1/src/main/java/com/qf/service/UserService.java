package com.qf.service;

import com.qf.pojo.TbUser;

/**
 * create by hhh7ox on 2022/5/19 17:23
 */
public interface UserService {
    TbUser findUserById(Long id);

    void addUser(TbUser tbUser);
}
