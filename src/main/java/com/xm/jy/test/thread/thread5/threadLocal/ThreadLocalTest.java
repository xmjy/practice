package com.xm.jy.test.thread.thread5.threadLocal;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 11:10
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
//        ThreadAndLocal threadAndLocal = new ThreadAndLocal();
//        Thread thread = new Thread(threadAndLocal);
//        ThreadLocal threadLocal = new ThreadLocal();
//        threadLocal.set(thread);
//        System.out.println(threadLocal.get());
//        threadLocal.remove();
//        System.out.println(threadLocal.get());
//        String str1 = "hello";
//        String str2 = "world";
//        String a = str1 + str2;
//        String b = str1 + new String(str2);
//        String c = str1 + str2;
//        System.out.println(a == b);
//        System.out.println(a == c);
        String[] strings = {"jj","is","ok"};
        functionOne(strings);
        functionTwo(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void functionOne(String[] strings){
        String[] arr = {"22","is","ok"};
        strings = arr;
    }

    public static void functionTwo(String[] strings){
        if (strings.length > 2){
            strings[2] = "not ok";
        }
    }
}
