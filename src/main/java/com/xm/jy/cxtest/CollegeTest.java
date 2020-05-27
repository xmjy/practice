package com.xm.jy.cxtest;

import com.xm.jy.Util.RemoveSameKeyListUtils;
import com.xm.jy.model.College;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CollegeTest
 * @Description: 构造两个College的List集合：南区学院到馆；北区学院到馆
 * @Author: 方翔鸣
 * @CreateDate: 2019/11/21 14:00
 */
public class CollegeTest {
    public static void main(String[] args) throws InterruptedException {
        // 建立一个southCollege对象往里面填充3个计算机学院和4个文学院的学院对象
        List<College> southCollege = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            College college = new College();
            college.setCollegeName("计算机学院");
            college.setCountNum(12);
            southCollege.add(college);
        }
        for (int i = 0; i < 4; i++) {
            College college = new College();
            college.setCollegeName("文学院");
            college.setCountNum(66);
            southCollege.add(college);
        }
        // 建立一个northCollege对象往里面填充3个建筑材料学院和6个食品学院的学院对象
        List<College> northCollege = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            College college = new College();
            college.setCollegeName("建筑材料学院");
            college.setCountNum(52);
            northCollege.add(college);
        }
        for (int i = 0; i < 6; i++) {
            College college = new College();
            college.setCollegeName("食品学院");
            college.setCountNum(88);
            northCollege.add(college);
        }
        // 第一步，用List的addAll方法，将两个相同类型的List合并成一个List（southCollege)
        southCollege.addAll(northCollege);
        // 第二步，将List里相同学院名的对象进行合并，同时将countNum进行相加，最后取出countNum最大的3个
        for (College college : RemoveSameKeyListUtils.getNewList(southCollege)) {
            System.out.println(college.getCollegeName() + "   "+college.getCountNum());
        }

    }
}
