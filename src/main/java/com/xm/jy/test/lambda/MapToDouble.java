package com.xm.jy.test.lambda;

import java.util.ArrayList;

/**
 * @author: albert.fang
 * @date: 2021/3/11 17:32
 * @description: lambda表达式之mapToDouble api使用（求和、最大、最小、平均）
 */
public class MapToDouble {
    public static void main(String[] args) {
//       test1();
        test2();
    }

    private static void test1(){
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(2.3333);
        doubles.add(2.333);
        doubles.add(2.34444);
        System.out.println(doubles.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println(doubles.stream().mapToDouble(Double::doubleValue).max().orElse(0.0));
        System.out.println(doubles.stream().mapToDouble(Double::doubleValue).min().orElse(0.0));
        System.out.println(doubles.stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
    }

    private static void test2(){
        ArrayList<String> stringDoubles = new ArrayList<>();
        stringDoubles.add("23.223");
        stringDoubles.add("23.233");
        stringDoubles.add("23.223");
        System.out.println(stringDoubles.stream().map(Double::new).mapToDouble(Double::doubleValue).sum());
        System.out.println(stringDoubles.stream().map(Double::new).mapToDouble(Double::doubleValue).max());
        System.out.println(stringDoubles.stream().map(Double::new).mapToDouble(Double::doubleValue).min());
        System.out.println(stringDoubles.stream().map(Double::new).mapToDouble(Double::doubleValue).average());
    }
}
