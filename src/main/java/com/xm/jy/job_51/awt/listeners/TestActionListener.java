package com.xm.jy.job_51.awt.listeners;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 点击动作监听
 */
public class TestActionListener {
    public static void main(String[] args) {
        Frame frame = new Frame("开始");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

//        button1.setActionCommand("button1-nb");
//        button2.setActionCommand("button2-nb");

        button1.addActionListener(new MyActionListener());
        button2.addActionListener(new MyActionListener());

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("按钮被点击了" + e.getActionCommand());
        System.out.println("多个按钮共享一个事件");
    }
}