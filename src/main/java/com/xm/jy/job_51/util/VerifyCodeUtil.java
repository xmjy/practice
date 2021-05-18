package com.xm.jy.job_51.util;

import java.awt.*;
import java.util.Random;

/**
 * @author: albert.fang
 * @date: 2020/5/8 17:19
 * @description: 生成验证码工具类
 */
public class VerifyCodeUtil {

    private static Random random = new Random();
    /**
     * 产生随机颜色
     * @return
     */
    public static Color randomColor(){
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r,g,b);
    }

    /**
     * 随机得到长度为4的字符数组
     * @return
     */
    public static char[] getRandChars(){
        char[] chars = new char[4];
        for (int i = 0; i < 4; i++) {
            // 设置生成字符类型，若为0则生成数字，1则生成字母
            int charType =  random.nextInt(2);
            if (charType == 0){
                // 0—9数字，askii码是48—57；随机生成48—57的数字，然后转成相应的0—9字符。
                char number = (char)(random.nextInt(10)+48);
                chars[i] = number;
            }else if (charType == 1){
                // A-Z字符，askii码是65—90；随机生成65—90的数字然后转换成相应的A-Z字符。
                char letter = (char)(random.nextInt(26)+65);
                chars[i] = letter;
            }
        }
        return chars;
    }

    /**
     * 生成随机线条
     * @param graphics
     * @param width 图片的宽度
     * @param height 图片的高度
     */
    public static void generateRandomLine(Graphics graphics,int width,int height){
        for (int i = 0; i < 8; i++) {
            graphics.setColor(VerifyCodeUtil.randomColor());
            Random random = new Random();
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int x2 = random.nextInt(width);
            int y2 = random.nextInt(height);
            graphics.drawLine(x1,y1,x2,y2);
        }
    }
}
