package com.xm.jy.test.learn.array;

/**
 * @ClassName: ArrayTwo
 * @Description: 数组学习2 二维数组和一维数组（二维数组其实就是一维数组的嵌套）
 * @Author: 方翔鸣
 * @CreateDate: 2019/12/6 11:09
 */
public class ArrayTwo {
    public static void main(String[] args) {
        int[][] a;
        a = new int[4][];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // 因为每个数组里面放的都是一维数组，所以默认值为null
        }
        a[0] = new int[2]; // a这个一维数组第一个位置放一个长度为2的数组
        a[0][1] = 6; // a1->b2(这个代表a这个数组的第一个位置放的b这个一维数组的第二个位置) 赋值6
        for (int i = 0; i < a[0].length; i++) {
            System.out.println(a[0][i]);
        }
    }
}
