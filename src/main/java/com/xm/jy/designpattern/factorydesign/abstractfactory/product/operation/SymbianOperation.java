package com.xm.jy.designpattern.factorydesign.abstractfactory.product.operation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:51
 * @description: Symbian系统的操作
 */
public class SymbianOperation extends AbstractOperation {

    private String name;

    @Override
    public void getOperationName() {
        System.out.println(this.name);
    }

    public SymbianOperation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
