package com.xm.jy.test.designpattern.sevenstructualpattern.compositepattern;

/**
 * @author: albert.fang
 * @date: 2021/1/14 14:23
 * @description: 单控件：文本框
 */
public class Input extends AbstractWidget {

    private String name;

    public Input(String name) {
        this.name = name;
    }

    @Override
    void paint() {
        System.out.println("生成Input文本框控件 >>> " + name);
    }
}
