package com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode;

import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.impl.EntireShowMode;
import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.impl.MemoryShowMode;
import com.xm.jy.designpattern.sixcreationpattern.builderpattern.showmode.impl.TidyShowMode;

/**
 * @author: albert.fang
 * @date: 2021/1/12 14:00
 * @description: 显示模式客户端
 */
public class Client {
    public static void main(String[] args) {
        ShowMode entirety = new EntireShowMode();
        ShowMode tidy = new TidyShowMode();
        ShowMode memory = new MemoryShowMode();
        new Director(entirety).construct();
        new Director(tidy).construct();
        new Director(memory).construct();
        System.out.println(entirety.getShow().toString());
        System.out.println(tidy.getShow().toString());
        System.out.println(memory.getShow().toString());
    }
}
