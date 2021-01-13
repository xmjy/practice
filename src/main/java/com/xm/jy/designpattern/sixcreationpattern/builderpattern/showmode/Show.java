package com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode;

import lombok.Data;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:41
 * @description: 显示
 */
@Data
public class Show {

    /**
     * 组件：主菜单
     */
    private String menu;

    /**
     * 组件：播放列表
     */
    private String playList;

    /**
     * 组件：主窗口
     */
    private String window;

    /**
     * 组件：控制条
     */
    private String strip;

    /**
     * 组件：收藏列表
     */
    private String favoriteList;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        if (getWindow() != null){
            builder.append("window=").append(getWindow()).append(" ");
        }
        if (getStrip() != null){
            builder.append("strip=").append(getStrip()).append(" ");
        }
        if (getFavoriteList() != null){
            builder.append("favoriteList=").append(getFavoriteList()).append(" ");
        }
        if (getPlayList() != null){
            builder.append("playList=").append(getPlayList()).append(" ");
        }
        if (getMenu() != null){
            builder.append("menu=").append(getMenu()).append(" ");
        }
        builder.append("]");
        return builder.toString();
    }

}
