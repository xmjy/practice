package com.xm.jy.designpattern.factorydesign.abstractfactory.product.Interface;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:58
 * @description: Android系统的游戏界面
 */
public class AndroidInterface extends AbstractInterface {

    private String name;

    @Override
    public void getInterfaceName() {
        System.out.println(this.name);
    }

    public AndroidInterface(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
