package com.xm.jy.job_51.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author: albert.fang
 * @date: 2020/4/24 15:54
 * @description: 测试的一些接口
 */
@Deprecated
@Controller
public class IndexController {

    @RequestMapping(value = "/testGraphics")
    public void testGraphics(HttpServletResponse response, @RequestParam(value = "imageType") int imageType) throws IOException {
        BufferedImage image = new BufferedImage(80,28,imageType);
        Graphics graphics = image.getGraphics();
        graphics.fillRect(0,0,80,28);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int x1 = random.nextInt(80);
            int y1 = random.nextInt(28);
            int x2 = random.nextInt(80);
            int y2 = random.nextInt(28);
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color color = new Color(red,green,blue);
            graphics.setColor(color);
            graphics.drawLine(x1,y1,x2,y2);
        }
        char[] chars = new char[4];
        // 将26个大写字母放在charAtoZ字符数组里
        char[] charAtoZ = new char[26];
        int startAtoZ = 65;
        for (int i = 0; i < 26; i++) {
            charAtoZ[i] = (char)startAtoZ;
            startAtoZ = startAtoZ + 1;
        }
        // 将0-9十个数字放在charNumbers数组里
        char[] charNumbers = new char[10];
        int startNumberIndex = 48;
        for (int i = 0; i < 10; i++) {
            charNumbers[i] = (char)startNumberIndex;
            startNumberIndex = startNumberIndex + 1;
        }
        // 生成随机四个组成字符
        for (int i = 0; i < 4; i++) {
            // 随机生成0或1，用于表示从字母数组随机取字符，还是数字数组随机取字符。
            int judgeNumber = random.nextInt(2);
            // 随机生成0的话，那么从字母数组里随机取
            if (judgeNumber == 0){
                int index = random.nextInt(26);
                chars[i] = charAtoZ[index];
            }
            if (judgeNumber == 1){
                int index = random.nextInt(10);
                chars[i] = charNumbers[index];
            }
        }

        Font font = new Font(null,Font.BOLD,26);
        for (int i = 0; i < chars.length; i++) {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color color = new Color(red,green,blue);
            graphics.setColor(color);
            graphics.setFont(font);
            graphics.drawString(String.valueOf(chars[i]),5+i*16,19+random.nextInt(8));
        }

        ImageIO.write(image,"JPEG",response.getOutputStream());
    }


}
