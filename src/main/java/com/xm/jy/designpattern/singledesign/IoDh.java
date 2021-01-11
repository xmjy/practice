package com.xm.jy.designpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 11:05
 * @description: IoDH技术实现单例模式：Initialization Demand Holder（初始化需求执行者）
 * 说大同一点就是：利用静态内部类来实现单例模式
 */
public class IoDh {

    private IoDh(){

    }

    private static class Inner{
        private final static IoDh INSTANCE = new IoDh();
    }

    /**
     * 用静态内部类，通过IoDH技术实现单例模式（延时加载、无线程安全问题）
     * 优点：
     * 1、不会和饿汉模式一样在初始化的时候就加载单例对象，避免后续不使用，造成内存资源占用情况。
     * 2、不会和延时加载懒汉模式一样，需要考虑诸多的线程安全问题。
     * @return 单例对象
     */
    public static IoDh getInstance(){
        return Inner.INSTANCE;
    }

}
