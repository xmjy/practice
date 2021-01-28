package com.xm.jy.test.designpattern.sixcreationpattern.builderpattern;

import com.xm.jy.test.designpattern.sixcreationpattern.builderpattern.simplerealize.Builder;
import com.xm.jy.test.designpattern.sixcreationpattern.builderpattern.simplerealize.ConcreteBuilder;
import com.xm.jy.test.designpattern.sixcreationpattern.builderpattern.simplerealize.Director;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:20
 * @description: 建造模式客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        builder.show();
    }
}
