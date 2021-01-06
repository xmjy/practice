package com.xm.jy.designpattern.factorydesign.simplefactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:31
 * @description: 圆形类
 */
public class Round extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("正在画圆形……");
    }

    @Override
    public void erase() {
        System.out.println("正在擦掉圆形~~~");
    }
}
