package com.xm.jy.designpattern.sixcreationpattern.builderpattern.simplerealize;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:18
 * @description: 指导者
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
    }
}
