package com.xm.jy.designpattern.factorydesign.factorymethod.picture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:28
 * @description: 图片抽象类
 */
public abstract class AbstractPicture {
    /**
     * 返回具体类型图片
     * @return 返回具体图片对象
     */
    public abstract AbstractPicture getPicture();

    /**
     * 得到图片类型
     * @return 返回图片类型
     */
    public abstract String pictureType();
}
