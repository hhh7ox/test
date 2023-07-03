package com.qf.interceptors;

import com.qf.constants.ResultCode;
import com.qf.exceptions.QueryException;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * create by hhh7ox on 2022/5/24 20:35
 */

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object tbUser = request.getSession().getAttribute("tbUser");
        if (tbUser==null){
            throw new QueryException("需要登录", ResultCode.LOGIN_FAIL);
        }
        return true;
    }
}
