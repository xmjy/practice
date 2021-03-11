package com.xm.jy.test.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author: albert.fang
 * @date: 2021/3/11 18:32
 * @description: lambda表达式之reduce api使用：reduce对流中的元素进行一些指定操作
 */
public class Reduce {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1(){
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).reduce(1, (result, value) -> {
            result += value;
            return result;
        }));
    }

    private static void test2(){
        System.out.println(Stream.of("我", "爱", "北", "京", "天", "安", "门").reduce("", (init, value) -> {
            init += value;
            return init;
        }));
    }
}
