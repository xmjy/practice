package com.xm.jy.redis;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther 方翔鸣
 * @date 2020/3/10 19:24
 */
@Data
public class RedisEntity implements Serializable {
    private String redisName;
    private String redisValue;
}
