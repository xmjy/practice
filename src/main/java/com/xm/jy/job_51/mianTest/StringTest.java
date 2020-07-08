package com.xm.jy.job_51.mianTest;

import java.util.Scanner;

/**
 * @author: albert.fang
 * @date: 2020/7/7 17:22
 * @description: 字符串匹配实现
 */
public class StringTest {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入父串：");
            String source = scanner.next();
            System.out.println("请输入子串：");
            String target = scanner.next();
            System.out.println("父串是否包含该子串：");
            System.out.println(containString(source,target));
            System.out.println("------------");
        }
    }

    private static boolean containString(String source,String target) throws Exception {
        if (source == null || target == null){
            throw new Exception("源字符串和目标字符串都不允许为null");
        }
        if (source.length() < target.length()){
            throw new Exception("子串长度比父串长");
        }
        if (target.equals("")){
            return true;
        }
        char[] sourceChars = source.toCharArray();
        char[] targetChars = target.toCharArray();
        // 连续相等的字符个数
        int targetLength = 0;
        for (int i = 0; i < sourceChars.length; i++) {
            // 看看父串中是否有子串的第一个字符
            if (sourceChars[i] == targetChars[0]){
                // 如果子串就只有一个字符
                if (targetChars.length == 1){
                    return true;
                }
                // 如果有的话，先对父串后续的字符长度和子串长度作比较
                if (sourceChars.length - i < targetChars.length){
                    return false;
                }
                // 如果长度符合，那么依次对后续子串字符进行比较
                for (int j = 0; j < targetChars.length; j++) {
                    if (targetChars[j] == sourceChars[i+j]){
                        targetLength++;
                    }
                    // 如果后续不符合，那么将targetLength赋值0,为了让下次更好的判断
                    else {
                        targetLength = 0;
                    }
                }
                // 找到之后，立马返回
                if (targetLength == targetChars.length){
                    return true;
                }

            }
        }
        return false;
    }
}
