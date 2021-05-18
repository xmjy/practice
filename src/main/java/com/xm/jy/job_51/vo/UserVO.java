package com.xm.jy.job_51.vo;

import com.xm.jy.job_51.util.GenerateIdUtil;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: albert.fang
 * @date: 2020/4/27 9:31
 * @description: controller层和页面的数据传输类
 */
@Data
public class UserVO {

    @NotBlank(message = "id不能为空")
    private String userId = GenerateIdUtil.generateId();

    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotBlank(message = "用户昵称不能为空")
    private String userNickname;

    @NotBlank(message = "密码不能为空")
    private String userPassword;

    private Integer userAge;

    private Integer userGender;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date userBirthDay;

    private String userBirthAddress;

}
