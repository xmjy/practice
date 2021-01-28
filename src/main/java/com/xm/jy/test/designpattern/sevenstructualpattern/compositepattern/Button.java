package com.xm.jy.test.designpattern.sevenstructualpattern.compositepattern;

/**
 * @author: albert.fang
 * @date: 2021/1/14 14:22
 * @description: 单控件：按钮
 */
public class Button extends AbstractWidget {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    void paint() {
        System.out.println("生成button按钮控件 >>> " + name);
    }
}
