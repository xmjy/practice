package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:40
 * @description: 操作抽象类
 */
public abstract class AbstractOperation {
    /**
     * 得到具体系统的操作方式
     * @return
     */
    public abstract void getOperationName();
}
