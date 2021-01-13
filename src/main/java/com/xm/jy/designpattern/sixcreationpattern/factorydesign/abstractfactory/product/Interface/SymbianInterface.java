package com.xm.jy.designpattern.sixcreationpattern.factorydesign.abstractfactory.product.Interface;

/**
 * @author: albert.fang
 * @date: 2021/1/6 15:56
 * @description: Symbian系统的游戏界面
 */
public class SymbianInterface extends AbstractInterface {

    private String name;
    @Override

    public void getInterfaceName() {
        System.out.println(this.name);
    }

    public SymbianInterface(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
