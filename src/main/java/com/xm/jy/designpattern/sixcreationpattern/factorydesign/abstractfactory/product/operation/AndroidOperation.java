package com.xm.jy.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:53
 * @description: Android系统的操作
 */
public class AndroidOperation extends AbstractOperation {

    private String name;

    @Override
    public void getOperationName() {
        System.out.println(this.name);
    }

    public AndroidOperation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
