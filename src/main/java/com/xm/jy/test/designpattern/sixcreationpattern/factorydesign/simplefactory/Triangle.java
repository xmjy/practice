package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.simplefactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:34
 * @description: 三角形类
 */
public class Triangle extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("正在画三角形……");
    }

    @Override
    public void erase() {
        System.out.println("正在擦拭三角形~~~");
    }
}
