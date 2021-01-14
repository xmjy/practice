package com.xm.jy.designpattern.sevenstructualpattern.bridgepattern;

import com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.abstractpart.MysqlDataBase;
import com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.implementpart.ConvertPdf;
import com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.implementpart.ConvertTxt;
import com.xm.jy.designpattern.sevenstructualpattern.bridgepattern.implementpart.ConvertXml;

/**
 * @author: albert.fang
 * @date: 2021/1/14 13:52
 * @description: 桥接模式客户端
 */
public class Client {
    public static void main(String[] args) {
        MysqlDataBase mysqlDataBase = new MysqlDataBase();
        mysqlDataBase.setConvertFile(new ConvertPdf());
        mysqlDataBase.dataBaseConvert();
        mysqlDataBase.setConvertFile(new ConvertTxt());
        mysqlDataBase.dataBaseConvert();
        mysqlDataBase.setConvertFile(new ConvertXml());
        mysqlDataBase.dataBaseConvert();
    }
}
