package com.xm.jy.test.io;

import java.io.File;
import java.io.IOException;

/**
 * @auther 方翔鸣
 * @date 2020/3/4 12:44
 * 创建文件，创建目录等操作，操作对象是所有文件相关
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D://304");
        System.out.println(file.mkdir());
        System.out.println(file.isDirectory());
        File document = new File("D://304/23.txt");
        System.out.println(document.createNewFile());
        File file1 = new File("D://304//305//306");
        System.out.println(file1.mkdirs());
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
        }
        for (String s : file.list()) {
            System.out.println(s);
        }
        File interview = new File("D://304//interview.txt");
        System.out.println(interview.createNewFile());
    }
}
