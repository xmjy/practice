package com.xm.jy.designpattern.sixcreationpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 13:30
 * @description: 测试单例模式
 */
public class SinglePatternTest {
    public static void main(String[] args) {
        // 1、饿汉单例模式
        HungrySingleTonPattern hungry1 = HungrySingleTonPattern.getInstance();
        HungrySingleTonPattern hungry2 = HungrySingleTonPattern.getInstance();
        System.out.println(hungry1 == hungry2);
        // 2、懒汉单例模式 double checked locking
        LazySingleTonPatternOptimize3 lazyOptimize1 = LazySingleTonPatternOptimize3.getInstance();
        LazySingleTonPatternOptimize3 lazyOptimize2 = LazySingleTonPatternOptimize3.getInstance();
        System.out.println(lazyOptimize1 == lazyOptimize2);
        // 3、静态内部类 Initialization Demand Holder
        IoDh ioDh1 = IoDh.getInstance();
        IoDh ioDh2 = IoDh.getInstance();
        System.out.println(ioDh1 == ioDh2);
        // 4、Enum
        SinglePatternEnum single1 = SinglePatternEnum.SINGLE_PATTERN_ENUM;
        SinglePatternEnum single2 = SinglePatternEnum.SINGLE_PATTERN_ENUM;
        System.out.println(single1 == single2);
    }
}
