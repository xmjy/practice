package com.xm.jy.designpattern.sevenstructualpattern.adapterpattern;

/**
 * @author: albert.fang
 * @date: 2021/1/14 11:20
 * @description: 目标
 */
public abstract class Target {

    public void stargeData(){
        System.out.println("将加密好的信息存储到数据库");
    }

    /**
     * 加密方法，第三方已经实现该功能，通过适配器直接调用
     */
    public abstract void encrypted();
}
