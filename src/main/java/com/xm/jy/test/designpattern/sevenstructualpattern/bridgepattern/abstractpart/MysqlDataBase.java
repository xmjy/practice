package com.xm.jy.test.designpattern.sevenstructualpattern.bridgepattern.abstractpart;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:41
 * @description: mysql数据库
 */
public class MysqlDataBase extends AbstractDataBase {
    @Override
    public void dataBaseConvert() {
        System.out.print("Mysql数据库文件 ");
        convertFile.convert();
    }
}
