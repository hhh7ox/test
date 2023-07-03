package com.qf.springproxy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by hhh7ox on 2022/5/18 17:59
 */
public class ProxyUtils {
    public static Object getProxyInstance(Object target){
        Object proxyInstance = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        Object result = method.invoke(target, args);
                        System.out.println("提交事务");
                        return result;
                    }
                }
        );
        return proxyInstance;
    }
}
