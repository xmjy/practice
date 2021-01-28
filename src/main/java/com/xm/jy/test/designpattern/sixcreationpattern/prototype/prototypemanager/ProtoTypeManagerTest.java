package com.xm.jy.test.designpattern.sixcreationpattern.prototype.prototypemanager;

/**
 * @author: albert.fang
 * @date: 2021/1/11 16:07
 * @description: 测试原型管理器
 */
public class ProtoTypeManagerTest {
    public static void main(String[] args) {
        ProtoTypeManager manager = ProtoTypeManager.getInstance();
        OfficialDocument srs1 = manager.getOfficialDocument("srs");
        srs1.displayOfficialDocument();
        OfficialDocument far1 = manager.getOfficialDocument("far");
        far1.displayOfficialDocument();
        OfficialDocument srs2 = manager.getOfficialDocument("srs");
        srs2.displayOfficialDocument();
        OfficialDocument far2 = manager.getOfficialDocument("far");
        far2.displayOfficialDocument();
        // 是浅拷贝出来的引用类型，所以应为两个false；浅拷贝，原型对象和克隆对象里的引用类型属性共有同一个内存地址。
        System.out.println(srs1 == srs2);
        System.out.println(far1 == far2);
    }
}
