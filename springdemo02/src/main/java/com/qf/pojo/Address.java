package com.qf.pojo;

/**
 * create by hhh7ox on 2022/5/18 11:11
 */
public class Address {
    private City city;
    private String addressName;

    public Address(City city, String addressName) {
        this.city = city;
        this.addressName = addressName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", addressName='" + addressName + '\'' +
                '}';
    }
}
