package com.xm.jy.designpattern.builderpattern.showmode.impl;

import com.xm.jy.designpattern.builderpattern.showmode.Show;
import com.xm.jy.designpattern.builderpattern.showmode.ShowMode;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:53
 * @description: 精简显示模式
 */
public class TidyShowMode implements ShowMode {

    private Show show = new Show();

    @Override
    public void showWindow() {
        show.setWindow("精简显示模式：显示主窗口组件");
    }

    @Override
    public void showStrip() {
        show.setStrip("精简显示模式：显示控制条组件");
    }

    @Override
    public void showPlayList() {

    }

    @Override
    public void showMenu() {

    }

    @Override
    public void showFavoriteList() {

    }

    @Override
    public Show getShow() {
        return show;
    }
}
