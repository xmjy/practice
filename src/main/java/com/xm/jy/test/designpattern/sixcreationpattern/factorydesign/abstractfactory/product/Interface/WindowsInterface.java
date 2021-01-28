package com.xm.jy.test.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:59
 * @description: windows系统的游戏界面
 */
public class WindowsInterface extends AbstractInterface {

    private String name;

    @Override
    public void getInterfaceName() {
        System.out.println(this.name);
    }

    public WindowsInterface(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
