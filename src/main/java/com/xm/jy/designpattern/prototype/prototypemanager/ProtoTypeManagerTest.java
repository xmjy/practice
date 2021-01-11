package com.xm.jy.designpattern.prototype.prototypemanager;

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
        // 是浅拷贝出来的应用类型，所以应为两个false
        System.out.println(srs1 == srs2);
        System.out.println(far1 == far2);
    }
}
