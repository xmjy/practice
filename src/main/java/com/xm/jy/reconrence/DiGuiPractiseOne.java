package com.xm.jy.reconrence;

/**
 * @auther 方翔鸣
 * @date 2020/3/7 14:24
 * 递归练习：第一个人10岁，第二个人比第一个大2岁，以此类推，第8个多大?
 */
public class DiGuiPractiseOne {
    public static void main(String[] args) {
        System.out.println(getAge(8));
    }

    public static int getAge(int number){
        if (number == 1){
            return 10;
        }else {
            return getAge(number - 1) + 2;
        }
    }
}
