package com.xm.jy.designpattern.factorydesign.simplefactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:25
 * @description: 形状抽象类
 */
public abstract class AbstractShape {
    /**
     * 描绘图形
     */
    public abstract void draw();

    /**
     * 擦拭图形
     */
    public abstract void erase();
}
