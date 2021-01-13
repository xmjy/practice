package com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.impl;

import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.Show;
import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.ShowMode;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:46
 * @description: 整体显示模式
 */
public class EntireShowMode implements ShowMode {

    private Show show = new Show();

    @Override
    public void showWindow() {
        show.setWindow("整体显示模式：显示主窗口组件");
    }

    @Override
    public void showStrip() {
        show.setStrip("整体显示模式：显示控制条组件");
    }

    @Override
    public void showPlayList(){
        show.setPlayList("整体显示模式：显示播放列表组件");
    }

    @Override
    public void showMenu(){
        show.setMenu("整体显示模式：显示菜单组件");
    }

    @Override
    public void showFavoriteList(){
        show.setFavoriteList("整体显示模式：显示收藏列表");
    }

    @Override
    public Show getShow() {
        return show;
    }
}
