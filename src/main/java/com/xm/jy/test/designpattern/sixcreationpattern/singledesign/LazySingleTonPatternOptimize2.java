package com.xm.jy.test.designpattern.sixcreationpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 10:15
 * @description: 懒汉模式优化2
 */
public class LazySingleTonPatternOptimize2 {
    /**
     * 为了将数据存在全局作用域，使之全局可用
     */
    private static LazySingleTonPatternOptimize2 optimizeLazy2;

    private LazySingleTonPatternOptimize2(){

    }

    /**
     * 经过前面的分析,我们知道，我们现在需要做的是细化锁（synchronized）的粒度，直接将锁加在方法上的话，在多线程情况下会影响性能。
     * 对于该方法而言，如果单例对象已经存在，那么直接返回给各个线程即可。
     * 所以这个锁的粒度细化应该是在判断单例对象是否为空的地方。（如下方法所示）
     * n个请求同时调用该方法，在还未存在单例对象的情况下，判断是否为空，n个请求同时进入到if语句里，争夺锁资源，创建单例对象。
     * 咋一看，这个单例模式确实可行，但是仔细一看的话，会发现这个优化方案还是存在问题的。
     * 问题描述：第一次n个请求同时进入到if语句里，在争夺锁资源。如果第一个争抢到锁的线程在完成创建单例对象之后释放掉了该锁，
     * 下一个线程抢到锁，但是并不知道该单例对象已经被创建了，所以还是会再继续创建一个该单例对象，
     * 以此类推，这n个请求会创建多个单例对象，与单例模式设计初衷不符。
     * 优化方案：在同步代码块里再进行一次单例对象是否为null的判断，如果为null，那么则创建单例对象。
     * @return 单例类对象
     */
    public static LazySingleTonPatternOptimize2 getInstance(){
        if (optimizeLazy2 == null){
            synchronized (LazySingleTonPatternOptimize2.class){
                optimizeLazy2 = new LazySingleTonPatternOptimize2();
            }
        }
        return optimizeLazy2;
    }
}
