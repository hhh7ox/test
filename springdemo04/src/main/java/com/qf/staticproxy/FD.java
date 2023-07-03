package com.qf.staticproxy;

/**
 * create by hhh7ox on 2022/5/18 17:18
 */
public class FD implements Sellable {
    @Override
    public void qht() {
        System.out.println("房东签合同");
    }

    @Override
    public void jq() {
        System.out.println("房东收钱");
    }
}
