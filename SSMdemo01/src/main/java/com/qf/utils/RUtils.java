package com.qf.utils;

import com.qf.constants.ResultCode;
import com.qf.dto.R;

/**
 * create by hhh7ox on 2022/5/24 16:06
 */

public class RUtils {
    public static R getQuerySuccess(Object data){
        return new R(ResultCode.QUERY_SUCCESS,"查询成功",data);
    }

    public static R getQueryFail(){
        return new R(ResultCode.QUERY_FAIL,"查询失败",null);
    }

    public static R getModifySuccess(){
        return new R(ResultCode.MODIFY_SUCCESS,"更新成功",null);
    }

    public static R getModifyFail(){
        return new R(ResultCode.MODIFY_FAIL,"更新失败",null);
    }

    public static R getIncreaseSuccess(){
        return new R(ResultCode.INCREASE_SUCCESS,"新增成功",null);
    }

    public static R getIncreaseFail(){
        return new R(ResultCode.INCREASE_FAIL,"新增失败",null);
    }

    public static R getDeleteSuccess(Object data){
        return new R(ResultCode.DELETE_SUCCESS,"删除成功",data);
    }

    public static R getDeleteFail(Object data){
        return new R(ResultCode.DELETE_FAIL,"删除失败",data);
    }

    public static R getLoginSuccess(){
        return new R(ResultCode.INCREASE_FAIL,"登陆成功",null);
    }

    public static R getException(Integer code,String message){
        return new R(code,message,null);
    }

}
