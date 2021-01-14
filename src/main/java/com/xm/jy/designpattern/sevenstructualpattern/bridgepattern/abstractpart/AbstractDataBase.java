package com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.abstractpart;

import com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.implementpart.ConvertFile;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:37
 * @description: 抽象部分
 */
public abstract class AbstractDataBase {
    public ConvertFile convertFile;
    public void setConvertFile(ConvertFile file){
        convertFile = file;
    }
    public abstract void dataBaseConvert();
}
