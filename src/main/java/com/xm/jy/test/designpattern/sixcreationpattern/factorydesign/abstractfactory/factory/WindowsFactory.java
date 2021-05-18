package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.factory;

import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface.AbstractInterface;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface.WindowsInterface;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation.AbstractOperation;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation.WindowsOperation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 16:08
 * @description: windows系统的操作和界面
 */
public class WindowsFactory extends AbstractFactory {
    @Override
    public AbstractOperation getOperation() {
        return new WindowsOperation("Windows 系统操作方式");
    }

    @Override
    public AbstractInterface getInterface() {
        return new WindowsInterface("Windows 系统游戏界面");
    }
}
