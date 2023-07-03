package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.constants.ResultCode;
import com.qf.exceptions.IncreaseException;
import com.qf.exceptions.ModifyException;
import com.qf.exceptions.QueryException;
import com.qf.mapper.TbUserMapper;
import com.qf.pojo.TbUser;
import com.qf.service.TbUserService;
import com.qf.utils.JudgeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import java.util.List;

/**
 * create by hhh7ox on 2022/5/24 11:42
 */

@Service
public class TbUserServiceImpl implements TbUserService {
    private TbUserMapper tbUserMapper;

    @Autowired
    public void setTbUserMapper(TbUserMapper tbUserMapper){
        this.tbUserMapper = tbUserMapper;
    }

    @Override
    public PageInfo<TbUser> queryAll(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TbUser> userList = tbUserMapper.selectAll();
        PageInfo<TbUser> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }

    @Override
    public TbUser queryByTbUserName(String username){
        TbUser tbUser = null;
        Assert.isTrue(!JudgeUtils.StringIsEmpty(username), ()-> {
            throw new QueryException("用户名为空，查询失败", ResultCode.QUERY_FAIL);
        });
        tbUser = tbUserMapper.selectByTbUserName(username);
        return tbUser;
    }

    @Override
    public void increase(TbUser tbUser) {
        Assert.isTrue(!JudgeUtils.objectAllPropertiesEmpty(tbUser),()->{
            throw new IncreaseException("插入元素不包含必要元素",ResultCode.INCREASE_FAIL);
        });
        try {
            tbUserMapper.insert(tbUser);
        }catch (Exception e){
            throw new IncreaseException("插入元素失败",ResultCode.INCREASE_FAIL);
        }
    }
    @Override
    public void modify(TbUser tbUser){
        Assert.isTrue(!JudgeUtils.objectSomePropertiesEmpty(tbUser),()->{
            throw new ModifyException("更改失败",ResultCode.MODIFY_FAIL);
        });
        tbUserMapper.updateTbUser(tbUser);
    }
}
