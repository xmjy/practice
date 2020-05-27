package com.xm.jy.bishi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 10:25
 */
public class FileTest {
    private static int fileNum = 0;
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D://304");
        System.out.println("总共有 "+getAllFileNum(file)+"个文件");
    }
    public static int getAllFileNum(File file){
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                getAllFileNum(listFile);
            }else {
                System.out.println(listFile.getAbsolutePath());
                fileNum++;
            }
        }
        return fileNum;
    }
}
