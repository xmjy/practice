package com.xm.jy.designpattern.elevenbehaviorpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: albert.fang
 * @date: 2021/1/13 16:09
 * @description: 被观察的目标
 */
public abstract class AbstractSubject {

    /**
     * 观察队列
     */
    public List<Observer> observers = new ArrayList<>();

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();

    /**
     * 往观察队列里增加观察者
     * @param observer 新增观察者
     */
    public void add(Observer observer){
        observers.add(observer);
    }

    /**
     * 从观察队列里移除观察者
     * @param observer 带移除观察者
     */
    public void detach(Observer observer){
        if (observers.size() > 0){
            observers.remove(observer);
        }
    }

}
