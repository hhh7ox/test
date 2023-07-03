package com.qf.event;

import org.springframework.stereotype.Component;

/**
 * create by hhh7ox on 2022/5/23 13:13
 */

@Component
public class Fire {
    private String address;


    public Fire() {
    }

    public Fire(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FIre{" +
                "address='" + address + '\'' +
                '}';
    }
}
