package com.xm.jy.designpattern.builderpattern.simplerealize;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:15
 * @description: 具体建造者
 */
public class ConcreteBuilder implements Builder {

    private Entirety entirety = new Entirety();

    @Override
    public void buildPart1() {
        entirety.setPart1("第一个部分：名字");
    }

    @Override
    public void buildPart2() {
        entirety.setPart2("第二个部分：性别");
    }

    @Override
    public void buildPart3() {
        entirety.setPart3("第三个部分：年龄");
    }

    @Override
    public Entirety getEntirety() {
        return entirety;
    }

    @Override
    public void show(){
        System.out.println(entirety.toString());
    }
}
