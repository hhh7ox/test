package com.qf.mapper;

import com.qf.pojo.TbUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * create by hhh7ox on 2022/5/17 19:09
 */
public interface UserMapper {
    TbUser selectById(@Param("id") Long id);

    List<TbUser> selectAll();

    @Select("<script>select * from tb_user where username like concat('%',#{name},'%')</script>")
    TbUser selectByLikeName(@Param("name") String name);

}
