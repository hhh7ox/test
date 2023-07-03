package com.qf.test;

import com.qf.springproxy.service.ProductService;
import com.qf.springproxy.service.UserService;
import com.qf.springproxy.service.impl.ProductServiceImpl;
import com.qf.springproxy.service.impl.UserServiceImpl;
import com.qf.springproxy.utils.ProxyUtils;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by hhh7ox on 2022/5/18 17:19
 */
public class SpringProxyTest {

    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        UserService proxyInstance = (UserService)Proxy.newProxyInstance(
                userServiceImpl.getClass().getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务");
                        Object invoke = method.invoke(userServiceImpl, args);
                        System.out.println(invoke);
                        System.out.println("提交事务");
                        return invoke;

                    }
                }
        );
        String result = proxyInstance.modifyUser("zhangsan");
        System.out.println(result);
    }

    @Test
    public void testProductService(){
        ProductService proxyInstance = (ProductService) ProxyUtils.getProxyInstance(new ProductServiceImpl());
        System.out.println(proxyInstance.buyProduct(20D));
    }

    @Test
    public void testProductServiceByEnhancer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductServiceImpl productServiceImpl = context.getBean(ProductServiceImpl.class);
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(productServiceImpl.getClass());
        enhancer.setCallback(new org.springframework.cglib.proxy.InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("开启事务");
                String result = (String) method.invoke(productServiceImpl, objects);
                System.out.println("提交事务");
                return result;
            }
        });

        ProductServiceImpl proxyInstance = (ProductServiceImpl) enhancer.create();
        System.out.println(proxyInstance.buyProduct(20D));

    }
}
