package com.qf.mapper;

import com.qf.pojo.TbUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * create by hhh7ox on 2022/5/19 17:43
 */
public interface UserMapper {

    @Select("select * from tb_user where id=#{id}")
    TbUser selectUserById(@Param("id") Long id);

    @Insert("INSERT INTO tb_user (username,password,email,gender,flag,role,code) values(#{username},#{password},#{email},#{gender},#{flag},#{role},#{code})")
    void addUser(TbUser tbUser);

}
