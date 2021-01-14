package com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.implementpart;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:42
 * @description: 转成txt文件
 */
public class ConvertTxt implements ConvertFile {
    @Override
    public void convert() {
        System.out.println("转成txt文件");
    }
}
