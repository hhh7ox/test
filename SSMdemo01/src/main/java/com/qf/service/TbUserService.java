package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.TbUser;

import java.util.List;

/**
 * create by hhh7ox on 2022/5/24 11:41
 */
public interface TbUserService {
    PageInfo<TbUser> queryAll(int PageNum,int pageSize);
    TbUser queryByTbUserName(String username);
    void increase(TbUser tbUser);
    void modify(TbUser tbUser);
}
