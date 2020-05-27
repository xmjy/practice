package com.xm.jy.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @auther 方翔鸣
 * @date 2020/3/10 19:16
 * spring-data-redis中规定的是
 * 1：当redis的k-v都是String的话，那么使用StringRedisTemplate模板;
 * 2：当redis的k-v非String的话，那么使用RedisTemplate模板；
 */
public class UseRedisTest {
    StringRedisTemplate stringRedisTemplate;
    RedisTemplate redisTemplate;
}
