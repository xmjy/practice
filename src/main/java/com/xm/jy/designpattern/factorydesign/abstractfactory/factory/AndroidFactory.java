package com.xm.jy.designpattern.factorydesign.abstractfactory.factory;

import com.xm.jy.designpattern.factorydesign.abstractfactory.product.Interface.AbstractInterface;
import com.xm.jy.designpattern.factorydesign.abstractfactory.product.Interface.AndroidInterface;
import com.xm.jy.designpattern.factorydesign.abstractfactory.product.operation.AbstractOperation;
import com.xm.jy.designpattern.factorydesign.abstractfactory.product.operation.AndroidOperation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 16:08
 * @description: Android系统的操作和界面
 */
public class AndroidFactory extends AbstractFactory {
    @Override
    public AbstractOperation getOperation() {
        return new AndroidOperation("Android 系统操作方式");
    }

    @Override
    public AbstractInterface getInterface() {
        return new AndroidInterface("Android 系统游戏界面");
    }
}
