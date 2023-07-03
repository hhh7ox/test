package com.qf.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * create by hhh7ox on 2022/5/23 12:47
 */

@RestControllerAdvice
public class MyException {

    @ExceptionHandler(NullPointerException.class)
    public String nullExc(NullPointerException nullPointerException){
        nullPointerException.printStackTrace();
        return "空指针异常";
    }

    @ExceptionHandler(Exception.class)
    public String exc(Exception e){
        return "未知异常";
    }

}
