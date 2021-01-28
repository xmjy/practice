package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.factory;

import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface.AbstractInterface;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface.SymbianInterface;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation.AbstractOperation;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation.SymbianOperation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 16:06
 * @description: Symbian系统的操作和界面
 */
public class SymbianFactory extends AbstractFactory {
    @Override
    public AbstractOperation getOperation() {
        return new SymbianOperation("Symbian 系统操作方式");
    }

    @Override
    public AbstractInterface getInterface() {
        return new SymbianInterface("Symbian 系统游戏界面");
    }
}
