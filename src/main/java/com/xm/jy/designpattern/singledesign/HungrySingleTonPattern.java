package com.xm.jy.designpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 10:30
 * @description: 饿汉模式：一劳永逸，在类初始化的时候就将单例对象创建好了，所以并不存在多线程情况下，资源性能问题。
 * 但是如果一个系统的单例类比较多，那么在系统加载的时间较长。
 */
public class HungrySingleTonPattern {
    private HungrySingleTonPattern(){

    }
    private static final HungrySingleTonPattern HUNGRY = new HungrySingleTonPattern();

    public static HungrySingleTonPattern getInstance(){
        return HUNGRY;
    }

}
