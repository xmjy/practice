package com.xm.jy.test.designpattern.sixcreationpattern.prototype.prototypemanager;

/**
 * @author: albert.fang
 * @date: 2021/1/11 15:50
 * @description: feasibility analysis report：可行性分析报告
 */
public class FAR implements OfficialDocument {
    @Override
    public void displayOfficialDocument() {
        System.out.println("feasibility analysis report：可行性分析报告");
    }

    @Override
    public OfficialDocument clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (FAR)object;
    }
}
