package com.xm.jy.job_51.mianTest;

import java.util.ArrayList;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:51
 * @description: 随便测试的内容，随测随删
 */
public class Test_51 {
    public static void main(String[] args) {
        String a = "sdfsdf";
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        System.out.println(arrayList.size());
        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
            if (arrayList.get(i) == 2){
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList.size());
    }
}
