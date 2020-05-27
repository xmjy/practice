package com.xm.jy.bishi;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 9:41
 * main-action-holder
 */
public class BiShiOne {
    public static void main(String[] args) {
        String str = "main-action-holder";
        String[] split = str.split("-");
        String finalStr =
                split[0]+split[1].substring(0,1).toUpperCase()+split[1].substring(1)+split[2].substring(0,1).toUpperCase()+split[2].substring(1);
        System.out.println(finalStr);
    }
}
