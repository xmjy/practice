package com.xm.jy.job_51.awt.layout;

import java.awt.*;

/**
 * 表格网状布局
 */
public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");

        //二行三列
        frame.setLayout(new GridLayout(2,3));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        
        //Java函数，自动最优布局
//        frame.pack();
        
        frame.setSize(400,400);
        
        frame.setVisible(true);
    }
}