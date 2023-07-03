package com.qf.test;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import com.qf.utils.MyBatisUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestUserMapper {
    @Test
    public void testSelect() throws Exception {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> userList = mapper.selectAll();
        System.out.println(userList);
        User user1 = mapper.selectById(1);
        System.out.println(user1);
        User user2 = mapper.selectBySexAndLikeName("女", "王");
        System.out.println(user2);
        User user3 = new User();
        user3.setName("张");
        user3.setSex("男");
        user3.setPassword("123");
        List<User> userList1 = mapper.selectBySexAndPasswordAndLikeName(user3);
        System.out.println(userList1);
    }

    @Test
    public void testSelectTemp() {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> users = mapper.selectUserAndUserDescByIdWithIn();
        System.out.println(users);
    }

    @Test
    public void testSelectUserByIds() {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<User> users = mapper.selectUserByIds(ids);
        System.out.println(users);
    }

    @Test
    public void testInsert() throws Exception {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        User user = new User(0, "zhangsan", "123", "女", new Date(), new Date());
        mapper.insertUser(user);
        System.out.println(user);
        MyBatisUtils.commit();
        System.out.println(user);
    }

    @Test
    public void testUpdate() throws Exception {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);

        mapper.updateUserNameById(12, "lisi");
        MyBatisUtils.commit();
    }

    @Test
    public void testDelete() throws Exception {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);

        mapper.deleteUserById(11);
        MyBatisUtils.commit();
    }
}
