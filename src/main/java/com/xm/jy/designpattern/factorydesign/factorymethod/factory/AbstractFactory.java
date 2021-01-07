package com.xm.jy.designpattern.factorydesign.factorymethod.factory;

import com.xm.jy.designpattern.factorydesign.factorymethod.picture.AbstractPicture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:35
 * @description: 工厂抽象类：有多个工厂，但是一个工厂只创建一种对象。
 */
public abstract class AbstractFactory {

    /**
     * 创建图片
     * @return 返回创建的具体类型图片
     */
    public abstract AbstractPicture createPicture();

    public void writePictureType(){
        AbstractPicture picture = createPicture();
        System.out.println(picture.pictureType());
    }
}
