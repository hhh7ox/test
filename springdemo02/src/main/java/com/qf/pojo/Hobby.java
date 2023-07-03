package com.qf.pojo;

/**
 * create by hhh7ox on 2022/5/18 11:11
 */
public class Hobby {
    private String hobbyName;

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                '}';
    }
}
