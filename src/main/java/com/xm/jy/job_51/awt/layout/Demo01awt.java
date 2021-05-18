package com.xm.jy.job_51.awt.layout;

import java.awt.*;

/**
 * 混合布局：边界布局加网状布局
 */
public class Demo01awt {
    public static void main(String[] args) {
        //主面板
        Frame frame = new Frame();
        
        frame.setLayout(new GridLayout(2,1));

        //四个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        //上面左右中间夹着上下
        panel1.add(new Button("East-1"),BorderLayout.EAST);
        panel1.add(new Button("West-1"),BorderLayout.WEST);
        //夹着的上下
        panel2.add(new Button("p1_s"));
        panel2.add(new Button("p1_x"));

        panel1.add(panel2,BorderLayout.CENTER);

        //下面左右中间夹着田字
        panel3.add(new Button("East-2"),BorderLayout.EAST);
        panel3.add(new Button("West-2"),BorderLayout.WEST);
        //中间的田字
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("tian"));
        }

        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

        frame.setLocation(200,200);

        frame.setSize(400,400);

        frame.setBackground(new Color(85,150,68));

        frame.setVisible(true);
    }
}