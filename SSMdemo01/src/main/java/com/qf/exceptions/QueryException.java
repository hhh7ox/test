package com.qf.exceptions;

/**
 * create by hhh7ox on 2022/5/24 16:47
 */
public class QueryException extends BaseException{

    public QueryException(String message, Integer code) {
        super(message, code);
    }
}
