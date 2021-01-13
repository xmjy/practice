package com.xm.jy.designpattern.sixcreationpattern.prototype.prototypemanager;

/**
 * @author: albert.fang
 * @date: 2021/1/11 15:41
 * @description: 公文对象接口：包含SRS（software requirements specification：软件需求规格说明书）文件和FAR（feasibility analysis report：可行性分析报告）文件
 */
public interface OfficialDocument extends Cloneable {
    /**
     * 展示公文对象名称
     */
    void displayOfficialDocument();

    /**
     * 克隆公文对象
     * @return 克隆之后的公文对象
     */
    OfficialDocument clone();
}
