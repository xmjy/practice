package com.xm.jy.test.nativePackage;

/**
 * @ClassName: HelloNative
 * @Description: 学习native key word
 * @Author: fxm
 * @CreateDate: 2019/11/28 10:39
 */
public class HelloNative {
    static {
        System.loadLibrary("HelloNative");
    }

    public static native void sayHello();

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        new HelloNative().sayHello();
    }
}
