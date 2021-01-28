package com.xm.jy.test.designpattern.sixcreationpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 10:08
 * @description: 单例模式的优化1
 */
public class LazySingleTonPatternOptimize1 {
    /**
     * 为了将数据存在全局作用域，使之全局可用
     */
    private static LazySingleTonPatternOptimize1 optimizeLazy1;

    private LazySingleTonPatternOptimize1(){

    }

    /**
     * 第一种优化方式：给这个全局的静态生成单例对象的方法加上关键字synchronized。
     * 这种优化方案确实是可行的，但是还是存在性能问题的。
     * 问题：不管单例对象是否存在，多个请求（线程）要同时获得该单例对象都要进行抢锁。
     * 如果是第一次n个请求的话，为了避免创建多个单例类对象，这样做是可以理解的；
     * 但是如果单例对象已经被创建了，其实直接返回这个单例对象就可以了。
     * 所以直接在该方法上加上synchronized关键字的话，在多线程情况下是存在性能问题的。
     * @return 单例类对象
     */
    public static synchronized LazySingleTonPatternOptimize1 getInstance(){
        if (optimizeLazy1 == null){
            optimizeLazy1 = new LazySingleTonPatternOptimize1();
        }
        return optimizeLazy1;
    }
}
