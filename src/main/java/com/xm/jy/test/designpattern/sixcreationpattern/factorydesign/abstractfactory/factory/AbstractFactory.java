package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.factory;

import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface.AbstractInterface;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation.AbstractOperation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 16:02
 * @description: 工厂抽象类
 */
public abstract class AbstractFactory {
    /**
     * 得到系统操作方式
     * @return 系统操作方式
     */
    public abstract AbstractOperation getOperation();

    /**
     * 得到系统的游戏界面
     * @return 系统游戏界面
     */
    public abstract AbstractInterface getInterface();
}
