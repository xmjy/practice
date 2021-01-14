package com.xm.jy.designpattern.sevenstructualpattern.adapterpattern;

/**
 * @author: albert.fang
 * @date: 2021/1/14 11:24
 * @description: 适配器客户端
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.stargeData();
        target.encrypted();
    }
}
