package com.xm.jy.test.bishi;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 10:20
 */
public class BiShiTwo {
    private static void funtion(int a) {
        int i = 2;
        while (true) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a /= i;
            } else
                i++;
            if (a == 1)
                break;
        }
    }

    public static void main(String[] args) {
        funtion(24);
    }
}
