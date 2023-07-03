package com.qf.constants;

/**
 * create by hhh7ox on 2022/5/24 15:50
 */

/**
 *  1x 查询相关
 *  2x 修改相关
 *  3x 增加相关
 *  4x 删除相关
 */
public interface ResultCode {
    Integer QUERY_SUCCESS = 11;
    Integer QUERY_FAIL = 12;
    Integer MODIFY_SUCCESS = 21;
    Integer MODIFY_FAIL = 22;
    Integer INCREASE_SUCCESS = 31;
    Integer INCREASE_FAIL = 32;
    Integer DELETE_SUCCESS = 41;
    Integer DELETE_FAIL = 42;
    Integer LOGIN_SUCCESS = 51;
    Integer LOGIN_FAIL= 52;



}
