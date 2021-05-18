package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.factorymethod.picture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:32
 * @description: png类型图片
 */
public class PngPicture extends AbstractPicture{
    @Override
    public AbstractPicture getPicture() {
        return new PngPicture();
    }

    @Override
    public String pictureType() {
        return "Png";
    }
}
