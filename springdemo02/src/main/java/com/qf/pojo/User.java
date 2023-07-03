package com.qf.pojo;

import java.util.List;

/**
 * create by hhh7ox on 2022/5/18 11:08
 */
public class User {
    private String name;
    private int age;
    private Address address;
    private List<Hobby> hobbyList;

    public void initUser(){
        System.out.println("初始化");
    }
    public void destroyUser(){
        System.out.println("销毁待清理");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", hobbyList=" + hobbyList +
                '}';
    }
}
