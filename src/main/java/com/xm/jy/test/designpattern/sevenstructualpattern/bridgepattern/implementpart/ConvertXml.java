package com.xm.jy.test.designpattern.sevenstructualpattern.bridgepattern.implementpart;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:44
 * @description: 转成xml文件
 */
public class ConvertXml implements ConvertFile {
    @Override
    public void convert() {
        System.out.println("转成xml文件");
    }
}
