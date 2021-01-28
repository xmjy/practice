package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.simplefactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:33
 * @description: 方形类
 */
public class Square extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("正在画方形……");
    }

    @Override
    public void erase() {
        System.out.println("正在擦拭方形~~~");
    }
}
