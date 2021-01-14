package com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.abstractpart;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:42
 * @description: sqlserver数据库
 */
public class SqlserverDataBase extends AbstractDataBase {
    @Override
    public void dataBaseConvert() {
        System.out.print("Sqlserver数据库文件 ");
        convertFile.convert();
    }
}
