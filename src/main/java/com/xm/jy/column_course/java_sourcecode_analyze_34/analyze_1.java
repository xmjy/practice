package com.xm.jy.column_course.java_sourcecode_analyze_34;

/**
 * @author: albert.fang
 * @date: 2020/7/15 10:34
 * @description:
 */
public class analyze_1 {
    public static void main(String[] args) {
        // 字符串拼接测试效率，StringBuilder > StringBuffer > String
        System.out.println(System.nanoTime());
        String s = "as";
        s += "asdfs";
        s += "sdfdsfdsf";
        System.out.println(System.nanoTime());
        StringBuffer stringBuffer = new StringBuffer("as");
        stringBuffer.append("asdfs").append("sdfdsfdsf");
        System.out.println(System.nanoTime());
        StringBuilder stringBuilder = new StringBuilder("as");
        stringBuilder.append("asdfs").append("sdfdsfdsf");
        System.out.println(System.nanoTime());
        // 创造字符串的几种方式
        // 1、new String(char[])
        // 2、new String(string)
        // 3、new String(stringBuffer)
        // 4、new String(stringBuilder)
        char[] chars = {'q','w','e'};
        String str = new String(chars);
        String str1 = new String("qwe");
        String str2 = new String(stringBuffer);
        String str3 = new String(stringBuilder);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        // 字符串的底层比较，都是通过char[]来逐个比较的
        System.out.println(str1.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        // compareTo的比较原理，也是通过逐个比较char[]来进行比较的，但是它有个特别的地方
        // this（统一指前面那个调用方法的字符串）和target（作为调用方法的入参的字符串，后面那个）
        // 首先，将this和target长度短的那个作为遍历次数，在遍历体力，它是通过逐位比较每个char的字符对应的askii码
        // 如果askii码相同，那么再比较this和target的长度
        // 总之，该方法返回0是代表两个字符串相等。
        // 如果是负数的情况则有可能是this长度比target小，还有可能相同位置的this字符askii码比target小
        // 如果是正数的情况，则和负数情况相反
        System.out.println("48".compareTo("4857"));
        System.out.println("ser".compareToIgnoreCase("SER"));
    }
}
