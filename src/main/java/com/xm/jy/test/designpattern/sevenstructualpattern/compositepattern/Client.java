package com.xm.jy.test.designpattern.sevenstructualpattern.compositepattern;

/**
 * @author: albert.fang
 * @date: 2021/1/14 14:28
 * @description: 组合模式：compositepattern的客户端
 */
public class Client {
    public static void main(String[] args) {
        Windows windows = new Windows("主窗口");
        windows.addWidget(new Button("1号按钮"));
        Windows subWindow = new Windows("子窗口");
        windows.addWidget(subWindow);
        subWindow.addWidget(new Button("子窗口添加按钮1"));
        subWindow.addWidget(new Button("子窗口添加按钮2"));
        windows.addWidget(new Button("2号按钮"));
        windows.addWidget(new Input("1号文本框"));
        windows.addWidget(new Input("2号文本框"));
        windows.paint();
    }
}
