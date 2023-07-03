package com.qf.service.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * create by hhh7ox on 2022/5/19 11:11
 */
public class TranAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("提交事务");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("开启事务");
    }
}
