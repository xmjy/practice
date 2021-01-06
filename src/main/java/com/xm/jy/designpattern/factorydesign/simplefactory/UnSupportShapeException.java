package com.xm.jy.designpattern.factorydesign.simplefactory;

/**
 * @author: albert.fang
 * @date: 2021/1/6 13:17
 * @description: 不支持的形状异常
 */
public class UnSupportShapeException extends Exception {
    public UnSupportShapeException(String message) {
        super(message);
    }
}
