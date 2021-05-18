package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory;

import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.factory.AndroidFactory;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.factory.SymbianFactory;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.factory.WindowsFactory;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface.AbstractInterface;
import com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.operation.AbstractOperation;

/**
 * @author: albert.fang
 * @date: 2021/1/6 16:10
 * @description: 抽象工厂测试
 */
public class FactoryTest {
    public static void main(String[] args) {
        AbstractOperation operation;
        AbstractInterface absInterface;
        operation = new SymbianFactory().getOperation();
        absInterface = new SymbianFactory().getInterface();
        operation.getOperationName();
        absInterface.getInterfaceName();
        operation = new AndroidFactory().getOperation();
        absInterface = new AndroidFactory().getInterface();
        operation.getOperationName();
        absInterface.getInterfaceName();
        operation = new WindowsFactory().getOperation();
        absInterface = new WindowsFactory().getInterface();
        operation.getOperationName();
        absInterface.getInterfaceName();
    }
}
