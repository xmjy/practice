package com.xm.jy.job_51.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:34
 * @description: 验证登录所需的参数
 */
@Data
public class LoginRequest {

    @NotBlank(message = "登录的用户名不能为空")
    private String userName;

    @NotBlank(message = "请输入密码")
    private String password;

    // 希望默认密码保存几天，默认是-1，表示关闭浏览器就失效
    private Integer manyDays;

    @NotBlank(message = "请输入验证码")
    private String code;
}
