package com.xm.jy.designpattern.sixcreationpattern.prototype.prototypemanager;

/**
 * @author: albert.fang
 * @date: 2021/1/11 15:47
 * @description: software requirements specification：软件需求规格说明书
 */
public class SRS implements OfficialDocument {
    @Override
    public void displayOfficialDocument() {
        System.out.println("software requirements specification：软件需求规格说明书");
    }

    @Override
    public OfficialDocument clone() {
        Object object = null;
        try{
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (SRS)object;
    }
}
