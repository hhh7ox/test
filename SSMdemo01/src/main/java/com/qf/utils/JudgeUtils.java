package com.qf.utils;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

/**
 * create by hhh7ox on 2022/5/24 17:25
 */
public class JudgeUtils {
    public static boolean StringIsEmpty(String str){
        return str.isEmpty()||str.trim().length()==0;
    }

    public static boolean objectAllPropertiesEmpty(Object obj){
        boolean flag = true;
        Class<?> objClass = obj.getClass();
        for (Field filed : objClass.getDeclaredFields()) {
            Object invokeValue= null;
            try {
                invokeValue = new PropertyDescriptor(filed.getName(), obj.getClass()).getReadMethod().invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (null!=invokeValue){
                flag = false;
            }
        }
        return flag;
    }
    public static boolean objectSomePropertiesEmpty(Object obj){
        boolean flag = false;
        Class<?> objClass = obj.getClass();
        for (Field filed : objClass.getDeclaredFields()) {
            Object invokeValue= null;
            try {
                invokeValue = new PropertyDescriptor(filed.getName(), obj.getClass()).getReadMethod().invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (null!=invokeValue){
                flag = true;
            }
        }
        return true;
    }
}
