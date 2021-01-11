package com.xm.jy.designpattern.singledesign;

/**
 * @author: albert.fang
 * @date: 2021/1/11 13:22
 * @description: 用Enum实现单例
 */
public enum SinglePatternEnum {
    /**
     * 单例对象
     */
    SINGLE_PATTERN_ENUM;

    public void printf(){
        System.out.println("打印一些字符");
    }
}
