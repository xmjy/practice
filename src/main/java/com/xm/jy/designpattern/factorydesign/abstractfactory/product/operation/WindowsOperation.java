package com.xm.jy.designpattern.factorydesign.abstractfactory.product.operation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:53
 * @description: Windows系统操作
 */
public class WindowsOperation extends AbstractOperation {

    private String name;

    @Override
    public void getOperationName() {
        System.out.println(this.name);
    }

    public WindowsOperation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
