package com.xm.jy.test.learn.array;

/**
 * @ClassName: ArrayOne
 * @Description: 数组学习1
 * @Author: 方翔鸣
 * @CreateDate: 2019/12/5 18:47
 */
public class ArrayOne {
    public static void main(String[] args) {
        // 静态初始化数组,指定初始化内容，长度系统定义
        String[] strings = {
            "江汉大学",
            "南昌大学"
        };
        System.out.println(strings.length);

        // 动态初始化数组,指定长度，初始化值系统定义
        String[]  strings1 = new String[10];
        for (String s : strings1) {
            System.out.println(s);
        }

        char[] chars = new char[3];
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        float[] floats = new float[3];
        for (float aFloat : floats) {
            System.out.println(aFloat);
        }

        double[] doubles = new double[10];
        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }

        Character character = 'w';
        System.out.println(character);

        int[][] ints = new int[][]{
                {1,2,3},
                {3,4,5},
                {2,3,4,4}
        };
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
        }
        System.out.println("***************");
        int[][] ints1 = new int[5][2];
        for (int[] ints2 : ints1) {
            for (int i : ints2) {
                System.out.println(i);
            }
            System.out.println(ints2);
        }

    }
}
