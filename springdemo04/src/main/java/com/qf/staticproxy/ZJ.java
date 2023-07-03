package com.qf.staticproxy;

/**
 * create by hhh7ox on 2022/5/18 17:19
 */
public class ZJ implements Sellable{
    private Sellable sellable;

    public void setSellable(Sellable sellable) {
        this.sellable = sellable;
    }

    @Override
    public void qht(){
        System.out.println("中介陪同看房");
        sellable.qht();
    }

    @Override
    public void jq() {
        System.out.println("中介陪同交钱");
        sellable.jq();
    }
}
