package com.xm.jy.job_cx.model;

/**
 * @ClassName: College
 * @Description: 学院到馆排行
 * @Author: 方翔鸣
 * @CreateDate: 2019/11/21 13:59
 */
public class College implements Comparable<College>{
    /**
     * 学院名字
     */
    private String collegeName;

    /**
     * 学院到馆次数
     */
    private Integer countNum;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    @Override
    public int compareTo(College o) {
        if(this.getCountNum()>o.getCountNum())
        {
            return -1;
        }
        else if(this.getCountNum()<o.getCountNum())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
