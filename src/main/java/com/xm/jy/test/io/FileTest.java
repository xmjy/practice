package com.xm.jy.test.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @auther 方翔鸣
 * @date 2020/3/4 12:44
 * 创建文件，创建目录等操作，操作对象是所有文件相关
 */
@Slf4j
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

    @Test
    void testParentFileList(){
        // if path is root path，may produce NPE
        File file = new File("E:\\zhiding\\images\\favicon.ico");
        if (file.exists()){
            for (File listFile : file.getParentFile().listFiles()) {
                log.info(listFile.getAbsolutePath());
            }
        }
    }

    @Test
    void testFileList(){
        // if path specified not folder,may produce NPE
        File file = new File("E:\\zhiding\\images\\favicon.ico");
        if (file.exists()){
            for (File listFile : Objects.requireNonNull(file.listFiles(),"listfiles 不能为空")) {
                log.info(listFile.getAbsolutePath());
            }
        }
    }

    @Test
    void testFileListWhenFolder(){
        File file = new File("E:\\zhiding\\images\\");
        if (file.exists()) {
            for (File listFile : Objects.requireNonNull(file.listFiles(),"rtyrty")) {
                log.info(listFile.getAbsolutePath());
            }
        }
    }

    @Test
    void testForeach(){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String single : Objects.requireNonNull(arrayList,"arraryList 为null")) {
            System.out.println(single);
        }
    }
}
