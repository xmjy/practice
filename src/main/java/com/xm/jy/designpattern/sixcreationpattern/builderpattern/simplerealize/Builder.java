package com.xm.jy.designpattern.sixcreationpattern.builderpattern.simplerealize;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:07
 * @description: 建造模式抽象建造者
 */
public interface Builder {
    /**
     * 建造整体的第一个部分
     */
    void buildPart1();

    /**
     * 建造整体的第二个部分
     */
    void buildPart2();

    /**
     * 建造整体的第三个部分
     */
    void buildPart3();

    /**
     * 建造完成三个部分之后，返回整体
     * @return 整体
     */
    Entirety getEntirety();

    /**
     * 展示建造者所建造的具体整体信息
     */
    void show();
}
