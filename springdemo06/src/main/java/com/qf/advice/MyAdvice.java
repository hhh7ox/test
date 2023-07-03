package com.qf.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * create by hhh7ox on 2022/5/19 19:36
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com..service.impl.*.*(..))")
    public void pc(){}

//    @Before(value = "pc()")
    public void before(JoinPoint joinPoint){
        System.out.println("开启事务");
    }

//    @AfterReturning(value = "pc()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("结束提交事务:" +result);
    }

//    @AfterThrowing(value = "pc()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        System.out.println(e.getStackTrace());
        System.out.println("异常通知");
    }

    @Around(value = "pc()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务");
        Object result = joinPoint.proceed();
        System.out.println("提交事务"+result);
        return result;
    }
}
