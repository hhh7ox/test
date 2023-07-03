package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * create by hhh7ox on 2022/5/20 17:27
 */

@Repository
public interface UserMapper {

    @Select("select * from tb_user where id = ${id}")
    User selectById(@Param("id") Long id);
}
