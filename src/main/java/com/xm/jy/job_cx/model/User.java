package com.xm.jy.job_cx.model;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:13
 * @description: 用户实体
 */
@Data
public class User {

    private String userId;

    private String userName;

    private String userNickname;

    private String userPassword;

    private Integer userGender;

    private Integer userAge;

    private Date userBirthDay;

    private String userBirthAddress;

    public static void main(String[] args) {
        Calendar cur = Calendar.getInstance();
        cur.set(Calendar.YEAR, cur.get(Calendar.YEAR) - 1);
        Date time = cur.getTime();
        System.out.println(new SimpleDateFormat("yyyyMMdd").format(time));
    }
}
