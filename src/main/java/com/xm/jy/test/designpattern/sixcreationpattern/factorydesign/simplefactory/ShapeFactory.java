package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.simplefactory;

import com.xm.practice.constants.DesignPatternConstants;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:35
 * @description: 形状工厂类
 * 简单工厂模式：所有类型的对象都是由一个工厂创建。
 * 如果新增一个对象实例，那么需要修改这个静态工厂的静态方法；不符合开闭原则。
 */
public class ShapeFactory {

    /**
     * 产品静态工厂类
     * @param type
     * @return
     */
    public static AbstractShape getShape(String type) throws UnSupportShapeException {
        AbstractShape shape = null;
        if (DesignPatternConstants.ROUND.equalsIgnoreCase(type)){
            shape = new Round();
        }
        else if (DesignPatternConstants.SQUARE.equalsIgnoreCase(type)){
            shape = new Square();
        }
        else if (DesignPatternConstants.TRIANGLE.equalsIgnoreCase(type)){
            shape = new Triangle();
        }
        else {
            throw new UnSupportShapeException("不支持该值该形状图形");
        }
        return shape;
    }

}
