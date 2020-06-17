package com.xm.jy.job_51.awt.listeners;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 文本框输入字符
 */
public class TestTestField {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends Frame {
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);
        //设置替换编码
        textField.setEchoChar('*');

        textField.addActionListener(new MyActionListener3());

        pack();
        setVisible(true);
    }

}
class MyActionListener3 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //.getSource()获得一些资源,如键盘输入
        TextField field = (TextField) e.getSource();
        //获得输入框中的文本
        System.out.println(field.getText());
        //向输入框中输入文本
        field.setText(" ");
    }
}