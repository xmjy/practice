package com.xm.jy.designpattern.factorydesign.simplefactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:45
 * @description: 简单工厂设计模式的测试
 */
public class SimpleFactoryTest {
    public static void main(String[] args) throws UnSupportShapeException {
        AbstractShape round = ShapeFactory.getShape("round");
        round.draw();
        round.erase();
        AbstractShape square = ShapeFactory.getShape("square");
        square.draw();
        square.erase();
        AbstractShape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();
        triangle.erase();
        AbstractShape others = ShapeFactory.getShape("others");
        others.draw();
        others.erase();
    }
}
