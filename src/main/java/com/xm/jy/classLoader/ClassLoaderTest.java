package com.xm.jy.classLoader;

import java.lang.reflect.Field;

/**
 * @auther 方翔鸣
 * @date 2020/3/6 18:15
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = new String();
        OneClass oneClass = new OneClass();
        Class<?> s1 = Class.forName("java.lang.String");
        for (Field field : s1.getDeclaredFields()) {
            System.out.println(field);
        }
    }
}
