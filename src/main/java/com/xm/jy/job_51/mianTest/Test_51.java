package com.xm.jy.job_51.mianTest;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:51
 * @description: 随便测试的内容，随测随删
 */
public class Test_51 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        if (map.containsKey(1)){
            map.put(1,map.get(1) + 1);
        }
        System.out.println(map.get(1));
    }
}
