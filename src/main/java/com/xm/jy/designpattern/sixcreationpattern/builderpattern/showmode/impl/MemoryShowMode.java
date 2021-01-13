package com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.impl;

import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.Show;
import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.ShowMode;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:56
 * @description: 记忆显示模式
 */
public class MemoryShowMode implements ShowMode {
    private Show show = new Show();

    @Override
    public void showWindow() {
        show.setWindow("记忆显示模式：显示主窗口组件");
    }

    @Override
    public void showStrip() {
        show.setStrip("记忆显示模式：显示控制条组件");
    }

    @Override
    public void showPlayList() {

    }

    @Override
    public void showMenu() {

    }

    @Override
    public void showFavoriteList() {
        show.setFavoriteList("记忆显示模式：显示收藏列表组件");
    }

    @Override
    public Show getShow() {
        return show;
    }
}
