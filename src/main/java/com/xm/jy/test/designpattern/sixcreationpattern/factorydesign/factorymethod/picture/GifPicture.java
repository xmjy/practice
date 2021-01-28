package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.factorymethod.picture;

/**
 * @author: albert.fang
 * @date: 2021/1/6 14:33
 * @description: gif类型图片
 */
public class GifPicture extends AbstractPicture {
    @Override
    public AbstractPicture getPicture() {
        return new GifPicture();
    }

    @Override
    public String pictureType() {
        return "Gif";
    }

}
