package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.factorymethod.picture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:32
 * @description: jpg类型图片
 */
public class JpgPicture extends AbstractPicture {
    @Override
    public AbstractPicture getPicture() {
        return new JpgPicture();
    }

    @Override
    public String pictureType() {
        return "Jpg";
    }
}
