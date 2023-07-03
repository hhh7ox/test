package com.qf.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    static {
        init();
    }

    private static void init(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException("读取mybatis配置文件失败");
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    public static SqlSession openSession(){
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSession(){
        SqlSession sqlSession = openSession();
        sqlSession.close();
        threadLocal.remove();
    }

    public static void commit(){
        SqlSession sqlSession = openSession();
        sqlSession.commit();
        closeSession();
    }

    public static <T> T getMapper(Class<T> tClass){
        SqlSession sqlSession = openSession();
        return sqlSession.getMapper(tClass);
    }




}
