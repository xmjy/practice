package com.xm.jy.test.column_course.java_sourcecode_analyze_34;

import java.util.HashMap;

/**
 * @author: albert.fang
 * @date: 2020/7/15 18:00
 * @description:
 */
public class analyze_2 {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("aa",23);
        hashMap.put("aa",32);
        for (String s : hashMap.keySet()) {
            System.out.println(hashMap.get(s));
        }
    }
}
