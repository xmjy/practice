package com.xm.jy.designpattern.factorydesign.factorymethod.factory;

import com.xm.jy.designpattern.factorydesign.factorymethod.picture.AbstractPicture;
import com.xm.jy.designpattern.factorydesign.factorymethod.picture.PngPicture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:42
 * @description: Png图片类型工厂
 */
public class PngFactory extends AbstractFactory {
    @Override
    public AbstractPicture createPicture() {
        return new PngPicture();
    }
}
