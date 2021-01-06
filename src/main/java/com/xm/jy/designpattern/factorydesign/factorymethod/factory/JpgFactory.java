package com.xm.jy.designpattern.factorydesign.factorymethod.factory;

import com.xm.jy.designpattern.factorydesign.factorymethod.picture.AbstractPicture;
import com.xm.jy.designpattern.factorydesign.factorymethod.picture.JpgPicture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:41
 * @description: Jpg图片类型工厂
 */
public class JpgFactory extends AbstractFactory {
    @Override
    public AbstractPicture createPicture() {
        return new JpgPicture();
    }
}
