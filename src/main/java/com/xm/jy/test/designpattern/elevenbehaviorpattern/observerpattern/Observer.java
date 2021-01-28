package com.xm.jy.test.designpattern.elevenbehaviorpattern.observerpattern;


/**
 * @author: albert.fang
 * @date: 2021/1/12 16:20
 * @description: 抽象观察者
 */
public interface Observer {
    /**
     * 目标发生变化之后，观察者做出的反应
     */
    void update(AbstractSubject subject);
}
