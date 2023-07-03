package com.qf.service.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * create by hhh7ox on 2022/5/19 11:11
 */
public class InterAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("判断条件");
        System.out.println("开启事务");
        Object result = invocation.proceed();
        System.out.println("提交事务");
        return result;
    }
}
