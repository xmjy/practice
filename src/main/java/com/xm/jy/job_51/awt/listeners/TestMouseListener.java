package com.xm.jy.job_51.awt.listeners;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 鼠标监听
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame2("画图变画点");
    }
}
class MyFrame2 extends Frame {
    ArrayList array;
    public MyFrame2(String title){
        super(title);
        setBounds(300,300,500,500);

        //存鼠标的点击的点
        array = new ArrayList<>();

        //鼠标监听器，针对这个窗口
        this.addMouseListener(new MyMouseListener());

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //监听鼠标事件
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,100,100);
        }
    }

    //集合里面存放监听到的点
    public void addPaint(Point point){
        array.add(point);
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        //鼠标点击
        public void mouseReleased(MouseEvent e) {
            //super.mouseReleased(e);
            MyFrame2 myFrame2 = (MyFrame2) e.getSource();
            //窗口调用存了点之后的集合方法，输入点x，y
            myFrame2.addPaint(new Point(e.getX(),e.getY()));
            //画笔只会画一次所以每次点击鼠标都需要重新画一次
            myFrame2.repaint();
        }
    }
}