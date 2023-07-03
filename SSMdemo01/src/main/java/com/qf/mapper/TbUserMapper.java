package com.qf.mapper;

import com.qf.pojo.TbUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * create by hhh7ox on 2022/5/24 11:23
 */

@Repository
@Transactional
public interface TbUserMapper {

    @Select("select * from tb_user")
    List<TbUser> selectAll();

    @Select("select * from tb_user where username=#{username}")
    TbUser selectByTbUserName(@Param("username") String username);

    @Insert("insert tb_user (username,password,email,gender,flag,role,code) values(#{username},#{password},#{email},#{gender},#{flag},#{role},#{code})")
    void insert(TbUser tbUser);

    void updateTbUser(TbUser tbUser);

}
