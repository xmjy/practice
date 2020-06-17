package com.xm.jy.job_51.awt;

import java.awt.*;

/**
 * 单frame窗口
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("第一个窗口");
        
        //窗口弹出的位置(位置：Location)以弹出窗口的左上角定点和屏幕的左上角定点衡量
//        frame.setLocation(200,200);

        //设置窗口大小(大小：Size)
//        frame.setSize(600,600);

        //设置背景颜色(背景：Background)
        frame.setBackground(new Color(237,237,237));

        // 等于setLocation和setSize两个方法的结合
        frame.setBounds(200,200,600,600);

        //是否可以手动调整窗口；true-可以；false-不可以
        frame.setResizable(true);
        
        //窗口可见(可见的：Visible)
        frame.setVisible(true);
    }
}