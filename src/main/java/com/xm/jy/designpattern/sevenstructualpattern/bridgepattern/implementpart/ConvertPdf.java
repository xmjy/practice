package com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.implementpart;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:43
 * @description: 转成pdf文件
 */
public class ConvertPdf implements ConvertFile {
    @Override
    public void convert() {
        System.out.println("转成pdf文件");
    }
}
