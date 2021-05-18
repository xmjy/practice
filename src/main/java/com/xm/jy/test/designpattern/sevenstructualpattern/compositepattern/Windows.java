package com.xm.jy.test.designpattern.sevenstructualpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: albert.fang
 * @date: 2021/1/14 14:24
 * @description: 复杂控件：窗口；包含若干按钮和文本框
 */
public class Windows extends AbstractWidget {

    private String name;

    public Windows(String name) {
        this.name = name;
    }

    private List<AbstractWidget> widgets = new ArrayList<>();

    /**
     * 给复杂控件里添加单控件
     * @param widget
     */
    public void addWidget(AbstractWidget widget){
        widgets.add(widget);
    }

    /**
     * 从复杂控件里移除单控件
     * @param widget
     */
    public void removeWidget(AbstractWidget widget){
        widgets.remove(widget);
    }

    @Override
    void paint() {
        System.out.println("窗口 " + name + "开始遍历 start ");
        for (AbstractWidget widget : widgets) {
            widget.paint();
        }
        System.out.println("窗口 " + name + "结束遍历 end ");
    }
}
