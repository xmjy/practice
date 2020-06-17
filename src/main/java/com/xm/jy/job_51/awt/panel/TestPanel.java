package com.xm.jy.job_51.awt.panel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("往frame框架添加panel");
        Panel panel = new Panel();

        //设置布局(布局：Layout)
        frame.setLayout(null);

        frame.setBounds(300, 300, 600, 600);

        frame.setBackground(new Color(85,150,68));

//        panel.setBounds(50,50,400,400);
        panel.setLocation(50,50);
        panel.setSize(400,400);
        panel.setBackground(new Color(105,39,0));
		
        // panel内嵌在frame里面
        frame.add(panel);
        
        frame.setVisible(true);
		
        //解决窗口点击X无法关闭问题
        //(监听者:Listener) 监听窗口关闭事件：System.exit(0)
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}