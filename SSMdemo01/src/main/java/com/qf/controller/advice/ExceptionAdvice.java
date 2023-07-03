package com.qf.controller.advice;

import com.qf.dto.R;
import com.qf.exceptions.BaseException;
import com.qf.utils.RUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * create by hhh7ox on 2022/5/24 17:53
 */

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(BaseException.class)
    public R processBaseException(BaseException baseException){
        baseException.printStackTrace();
        return RUtils.getException(baseException.getCode(),baseException.getMessage());
    }
}
