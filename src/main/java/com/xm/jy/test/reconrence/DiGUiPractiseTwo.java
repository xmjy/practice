package com.xm.jy.test.reconrence;

import java.io.File;

/**
 * @auther 方翔鸣
 * @date 2020/3/7 14:29
 * 递归联系：将一个文件夹下的文件遍历，如果该文件夹下的文件还有文件夹的话，以此递归遍历
 */
public class DiGUiPractiseTwo {
    public static void main(String[] args) {
        File file = new File("D://304");
        diGuiDocument(file);
    }
    public static void diGuiDocument(File file){
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                System.out.println(listFile.getAbsolutePath() + "是文件夹");
                diGuiDocument(listFile);
            }else {
                System.out.println(listFile.getAbsolutePath() + "是文件");
            }
        }
    }
}
