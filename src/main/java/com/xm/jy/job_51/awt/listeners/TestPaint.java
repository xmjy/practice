package com.xm.jy.job_51.awt.listeners;

import java.awt.*;

/**
 * 文本窗涂画(画笔：paint)
 */
public class TestPaint {
    public static void main(String[] args) {
        new My1Frame().ffMyFrame();
    }
}
class My1Frame extends Frame {
    public void ffMyFrame(){
        setBounds(300,300,600,600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        //圆
        g.drawOval(100,100,100,100);
        //实心圆
        g.fillOval(100,100,100,100);
    }
}