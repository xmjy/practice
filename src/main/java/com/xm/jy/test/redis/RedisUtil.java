package com.xm.jy.test.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @auther 方翔鸣
 * @date 2020/3/10 19:36
 * 对StringRedisTemplate中的opsForValue和get和set方法
 */
@Component
public class RedisUtil {
    @Autowired
    private StringRedisTemplate template;

    public String get(String key){
        return template.opsForValue().get(key);
    }

    public void set(String key,String value){
        template.opsForValue().set(key,value);
    }
}
