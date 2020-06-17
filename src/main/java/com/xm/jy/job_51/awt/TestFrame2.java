package com.xm.jy.job_51.awt;

import java.awt.*;

/**
 * 多个frame窗口
 */
public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.BLUE);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.YELLOW);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.MAGENTA);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.RED);
    }
}
class MyFrame extends Frame {
    //多窗口计数器
    private static int id = 0;

    MyFrame(int x, int y, int w, int h, Color color){
        //调用父类构造器
        super("MyFrame "+id);
        
        //设置窗口大小弹出的位置(范围：Bounds)
        setBounds(x, y, w, h);
		
        setBackground(color);

        setResizable(true);
        
        setVisible(true);
    }
}