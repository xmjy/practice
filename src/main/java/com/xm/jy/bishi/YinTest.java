package com.xm.jy.bishi;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 10:50
 */
public class YinTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            getSum(i);
        }
    }

    public static void getSum(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num%i == 0){
                sum = sum+i;
            }
        }
        if (num == sum){
            System.out.println(num);
        }
    }
}
