package com.xm.jy.job_51.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author: albert.fang
 * @date: 2020/4/27 9:26
 * @description: 传输层数据(用于controller层和service层的数据流动)
 */
@Data
public class UserDTO {

    private String userId;

    private String userName;

    private String userNickname;

    private String userPassword;

    private Integer userGender;

    private Integer userAge;

    private Date userBirthDay;

    private String userBirthAddress;
}
