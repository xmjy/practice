package com.xm.jy.job_51.awt.layout;

import java.awt.*;

/**
 * 布局管理器之流式布局 FlowLayout
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //设置按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //按钮左中右分布
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setLocation(600,600);
        frame.setSize(400,400);

        frame.setVisible(true);
    }
}