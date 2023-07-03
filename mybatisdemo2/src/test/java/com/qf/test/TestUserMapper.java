package com.qf.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.mapper.UserMapper;
import com.qf.pojo.TbUser;
import com.qf.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * create by hhh7ox on 2022/5/17 19:13
 */
public class TestUserMapper {

//    测试连接池
    @Test
    public void testSelect(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        TbUser tbUser = mapper.selectById(1L);
        System.out.println(tbUser);
    }

//    测试分页器
    @Test
    public void testSelectAll(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        PageHelper.startPage(2,2);
        List<TbUser> tbUserList = mapper.selectAll();
        PageInfo<TbUser> tbUserPageInfo = new PageInfo<>(tbUserList);

        System.out.println(tbUserPageInfo);
    }

//    测试MyBatis注解
    @Test
    public void testAnnotationSelect(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        TbUser tbUser = mapper.selectByLikeName("adm");
        System.out.println(tbUser);

    }

}
