package com.xm.jy.job_51.vo;

import lombok.Data;

/**
 * @author: albert.fang
 * @date: 2020/5/6 16:45
 * @description: 验证码展示类
 */
@Data
public class VerifyCodeVO {

    private String code;

    private byte[] imgBytes;

    private long expireTime;

}
