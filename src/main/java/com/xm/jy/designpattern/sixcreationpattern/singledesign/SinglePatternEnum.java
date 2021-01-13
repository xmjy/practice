package com.xm.jy.designpattern.sixcreationpattern.singledesign;

import java.io.Serializable;

/**
 * @author: albert.fang
 * @date: 2021/1/11 13:22
 * @description: 用Enum实现单例
 */
public enum SinglePatternEnum  implements Serializable {
    /**
     * 单例对象
     */
    SINGLE_PATTERN_ENUM;

    SinglePatternEnum(){
        System.out.println("调用了枚举中的构造方法");
    }

    public void printf(){
        System.out.println("打印一些字符");
    }
}
