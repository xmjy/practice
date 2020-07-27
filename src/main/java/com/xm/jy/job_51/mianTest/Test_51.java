package com.xm.jy.job_51.mianTest;

import com.xm.jy.test.api.A;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:51
 * @description: 随便测试的内容，随测随删
 */
public class Test_51 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(){
            {
                add(23);
                add(24);
                add(26);
                add(25);
            }
        };
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(){
            {
                add(23);
                add(24);
            }
        };
        arrayList.sort(Integer::compareTo);
        arrayList1.set(1,45);
    }
}
