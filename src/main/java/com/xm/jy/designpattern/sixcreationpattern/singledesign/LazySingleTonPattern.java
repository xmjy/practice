package com.xm.jy.designpattern.sixcreationpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 9:40
 * @description: 懒汉单例模式
 */
public class LazySingleTonPattern {

    /**
     * 为了将数据存在全局作用域，使之全局可用
     */
    private static LazySingleTonPattern lazy;

    private LazySingleTonPattern(){

    }

    /**
     * 全局静态方法
     * 缺点：造成资源性能消耗问题，多线程环境下创建多个单例类对象与单例模式设计思想不符。
     * 问题分析：有n（很大很大的值）个请求，如果这n个请求同时进入getInstance方法，同时进行lazy == null 是否为空的判断。
     * 如果都是在单例对象没有创建前进行判断的话，那么这n个请求都会满足lazy == null这个条件，从而执行 lazy = new LazySingleTonPattern();
     * 创建了n个LazySingleTonPattern对象。
     * 虽然不影响执行结果，但是这种可能的存在不符合单例模式的初衷。
     * @return 单例类对象
     */
    public static LazySingleTonPattern getInstance(){
        if (lazy == null){
            lazy = new LazySingleTonPattern();
        }
        return lazy;
    }

}
