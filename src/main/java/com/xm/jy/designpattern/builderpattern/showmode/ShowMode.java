package com.xm.jy.designpattern.builderpattern.showmode;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:40
 * @description: 显示模式
 */
public interface ShowMode {
    /**
     * 显示主窗口
     */
    void showWindow();

    /**
     * 显示控制条
     */
    void showStrip();

    /**
     * 显示播放列表
     */
    void showPlayList();

    /**
     * 显示菜单
     */
    void showMenu();

    /**
     * 显示收藏列表
     */
    void showFavoriteList();

    /**
     * 返回显示
     * @return 具体显示模式的显示对象
     */
    Show getShow();
}
