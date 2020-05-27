package com.xm.jy.test;

/**
 * @ClassName: StaticInitTest
 * @Description: description of class
 * @Author: Albert
 * @CreateDate: 2019/12/11 14:07
 */
public class StaticInitTest {

    {
        a = 45;
        System.out.println("werwer");
    }
    public StaticInitTest(){
        StaticInitTest.a = 23;
    }
    private static int a = 9;
    public static void main(String[] args) {
        StaticInitTest staticInitTest = new StaticInitTest();
//        System.out.println(staticInitTest.a);
        System.out.println(a);
    }
}
