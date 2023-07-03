package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(@Param("id") Integer id);

    User selectBySexAndLikeName(@Param("sex") String sex, @Param("name") String name);

    void insertUser(@Param("user") User user);

    void updateUserNameById(@Param("id") Integer id, @Param("name") String name);

    void deleteUserById(@Param("id") Integer id);

    List<User> selectBySexAndPasswordAndLikeName(@Param("user") User user);

    List<User> selectUserAndUserDescByIdWithIn();

    List<User> selectUserByIds(@Param("ids") List<Integer> ids);


}
