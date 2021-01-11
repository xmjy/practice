package com.xm.jy.designpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 10:26
 * @description: 懒汉模式的优化3
 */
public class LazySingleTonPatternOptimize3 {
    /**
     * 为了将数据存在全局作用域，使之全局可用
     */
    private static volatile LazySingleTonPatternOptimize3 optimizeLazy3;

    private LazySingleTonPatternOptimize3(){

    }

    /**
     * 双重检查锁定（double-checking Locking）
     * 完美地解决在多线程情况下只对第一次单例对象为null的时候进行争夺锁资源。
     * 后续单例对象已经存在的话，那么直接返回该单例对象即可。
     * 需要注意的是：double-checking Locking 单例对象必须用volatile关键字修饰。
     * volatile关键字：
     * 1、多线程情况下，一个线程对该变量值的修改，其他线程是可见的。
     * 2、禁止jvm指令重排序。
     * @return 单例类对象
     */
    public static LazySingleTonPatternOptimize3 getInstance(){
        if (optimizeLazy3 == null){
            synchronized (LazySingleTonPatternOptimize3.class){
                if (optimizeLazy3 == null){
                    optimizeLazy3 = new LazySingleTonPatternOptimize3();
                }
            }
        }
        return optimizeLazy3;
    }
}
