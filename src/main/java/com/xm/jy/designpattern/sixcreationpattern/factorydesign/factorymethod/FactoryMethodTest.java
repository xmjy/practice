package com.xm.jy.designpattern.sixcreationpattern.factorydesign.factorymethod;

import com.xm.jy.designpattern.sixcreationpattern.factorydesign.factorymethod.factory.AbstractFactory;
import com.xm.jy.designpattern.sixcreationpattern.factorydesign.factorymethod.factory.GifFactory;
import com.xm.jy.designpattern.sixcreationpattern.factorydesign.factorymethod.factory.JpgFactory;
import com.xm.jy.designpattern.sixcreationpattern.factorydesign.factorymethod.factory.PngFactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:43
 * @description: 工厂方法测试
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AbstractFactory factory;
        factory = new GifFactory();
        factory.writePictureType();
        factory = new JpgFactory();
        factory.writePictureType();
        factory = new PngFactory();
        factory.writePictureType();
    }
}
