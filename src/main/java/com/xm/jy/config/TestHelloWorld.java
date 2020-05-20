package com.xm.jy.config;

/**
 * @auther Albert
 * @date 2020/2/15 14:12
 */
public class TestHelloWorld {
    public static void main(String[] args) {
//        testIfConsumeTime();
//        calculateTryAndCatchTime();
        System.out.println(System.getProperty("java.util.concurrent"));
    }
    public static void testIfConsumeTime(){
        long start = System.nanoTime();
        if (true){
            System.out.println(System.nanoTime() - start);
        }
    }

    public static void calculateTryAndCatchTime(){
        long start = System.nanoTime();
        try {
            long end = start/0;
        }catch (ArithmeticException e){
            System.out.println(System.nanoTime() - start);
        }
    }
}
