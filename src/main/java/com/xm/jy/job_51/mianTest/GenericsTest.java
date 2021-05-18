package com.xm.jy.job_51.mianTest;

import com.xm.jy.job_51.generics.GenericsClass;

/**
 * @author: albert.fang
 * @date: 2020/4/23 10:17
 * @description: 理解泛型
 */
public class GenericsTest {
    public static void main(String[] args) {
        testGenericsClass();
        System.out.println(get("17",34));
        System.out.println(compareTo(12,13));
    }

    /**
     * 测试泛型类
     */
    private static void testGenericsClass(){
        GenericsClass<String> value = new GenericsClass<>("string");
        System.out.println(value.getValue());
        value.setValue(" is not stringBuilder");
        System.out.println(value.getValue());
        System.out.println(value.getTRV("ljy",23,"男"));
    }

    /**
     * 泛型方法
     * @param t
     * @param u
     * @param <T>
     * @param <V>
     * @return
     */
    private static <V,T> T get(T t, V u){
        if (u != null){
            return t;
        }
        return null;
    }

    /**
     * 这里在声明泛型T的时候已经显示的继承了Comparable接口,所以泛型T所对应的对象t1,t2能够调用compareTo方法
     * 如果只是普通的声明一个泛型而不继承任何类或接口，那么该泛型的对象默认只能调用Object基类的方法
     * @param t1
     * @param t2
     * @param <T>
     * @return
     */
    private static <T extends Comparable> T compareTo(T t1,T t2){
        if (t1.compareTo(t2) >= 0){
            return t1;
        }
        return t2;
    }
}
