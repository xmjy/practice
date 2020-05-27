package com.xm.jy.sort;

import java.util.Arrays;

/**
 * @auther 方翔鸣
 * @date 2020/3/7 19:30
 */
public class SortTest {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,14,34,23};
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
