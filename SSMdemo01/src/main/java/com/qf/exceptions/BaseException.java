package com.qf.exceptions;

/**
 * create by hhh7ox on 2022/5/24 16:18
 */
public class BaseException extends RuntimeException{
private Integer code;

    public BaseException(String message,Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
