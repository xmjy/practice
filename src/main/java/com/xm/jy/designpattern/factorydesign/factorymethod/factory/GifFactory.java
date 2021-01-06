package com.xm.jy.designpattern.factorydesign.factorymethod.factory;

import com.xm.jy.designpattern.factorydesign.factorymethod.picture.AbstractPicture;
import com.xm.jy.designpattern.factorydesign.factorymethod.picture.GifPicture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:41
 * @description: gif图片工厂
 */
public class GifFactory extends AbstractFactory {
    @Override
    public AbstractPicture createPicture() {
        return new GifPicture();
    }
}
