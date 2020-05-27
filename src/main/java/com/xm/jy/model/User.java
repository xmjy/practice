package com.xm.jy.model;

import lombok.Data;

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
}
