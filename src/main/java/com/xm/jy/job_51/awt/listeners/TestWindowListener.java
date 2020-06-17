package com.xm.jy.job_51.awt.listeners;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 窗口监听
 */
public class TestWindowListener {
    public static void main(String[] args) {
        new MyFrame3();
    }
}
class MyFrame3 extends Frame {
    public MyFrame3() {
        setBackground(new Color(238,255,255));
        setBounds(300,300,500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            //关闭窗口
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭Closing");
                System.exit(0);
            }

            //鼠标移开窗口隐藏
            @Override
            public void windowActivated(WindowEvent e) {
                MyFrame3 myFrame3 = (MyFrame3) e.getSource();
                myFrame3.setTitle("窗口激活了");
                System.out.println("激活Activated");
            }
        });
    }
}