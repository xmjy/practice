package com.xm.jy.job_51.mianTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: albert.fang
 * @date: 2020/4/22 13:17
 * @description: 查询指定文件夹中有几个文件，几个文件夹
 */
public class HowMuchFiles {

    private static int fileNum;

    private static int directoryNum;

    public static void main(String[] args) {
        File file = new File("E:\\IdeaProjects\\timer");
        Map<String,Integer> map = CountFiles(file);
        for (String o : map.keySet()) {
            System.out.println(o+map.get(o));
        }
    }

    public static Map CountFiles(File file){
        HashMap<String,Integer> map = new HashMap();
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                directoryNum++;
                CountFiles(listFile);
            }else {
                fileNum++;
            }
        }
        map.put(file.getAbsolutePath()+"路径下的文件夹个数有：",directoryNum);
        map.put(file.getAbsolutePath()+"路径下的文件个数有：",fileNum);
        return map;
    }
}
