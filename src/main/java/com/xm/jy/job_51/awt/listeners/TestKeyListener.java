package com.xm.jy.job_51.awt.listeners;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 键盘监听事件
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new MyFrame4();
    }
}
class MyFrame4 extends Frame {
    public MyFrame4(){
        setBounds(200,200,500,500);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //获取键盘敲打
                int keyCode = e.getKeyCode();
                
                System.out.println(keyCode);
                
                if (keyCode==KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }else if (keyCode==KeyEvent.VK_DOWN){
                    System.out.println("你按下了下键");
                }else if (keyCode==KeyEvent.VK_LEFT){
                    System.out.println("你按下了左键");
                }else if (keyCode==KeyEvent.VK_RIGHT){
                    System.out.println("你按下了右键");
                }
            }
        });
    }
}