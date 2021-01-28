package com.xm.jy.test.designpattern.sevenstructualpattern.adapterpattern;

/**
 * @author: albert.fang
 * @date: 2021/1/14 11:24
 * @description: 适配器客户端
 */
public class Client {
    public static void main(String[] args) {
        AbstractTarget abstractTarget = new Adapter();
        abstractTarget.stargeData();
        abstractTarget.encrypted();
    }
}
