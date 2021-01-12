package com.xm.jy.designpattern.builderpattern.showmode;

/**
 * @author: albert.fang
 * @date: 2021/1/12 13:57
 * @description: 创建具体显示模块的指导者
 */
public class Director {
    private ShowMode showMode;
    public Director(ShowMode showMode){
        this.showMode = showMode;
    }
    public void construct(){
        showMode.showFavoriteList();
        showMode.showMenu();
        showMode.showPlayList();
        showMode.showStrip();
        showMode.showWindow();
    }
}
