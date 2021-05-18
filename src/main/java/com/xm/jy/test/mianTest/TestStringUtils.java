package com.xm.jy.test.mianTest;

/**
 * @ClassName: TestStringUtils
 * @Description: 类的作用描述
 * @Author: 方翔鸣
 * @CreateDate: 2019/12/10 15:29
 */
public class TestStringUtils {

    private int a = 8;
    {
        a = 10;
    }
    public static void main(String[] args) {
        String a = "stringUtilsz";
        System.out.println(a.contains("z"));
        TestStringUtils testStringUtils = new TestStringUtils();
        System.out.println(testStringUtils.a);
    }
}
