package com.xm.jy.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 方翔鸣
 * @date 2020/3/10 19:25
 */
@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/getRedis")
    public String getRedis(){
        stringRedisTemplate.opsForValue().set("first","方翔鸣");
        RedisEntity redisEntity = new RedisEntity();
        redisEntity.setRedisName("this is key");
        redisEntity.setRedisValue("this is value");
        redisTemplate.opsForValue().set("redisEntity",redisEntity);
        return redisTemplate.opsForValue().get("redisEntity").toString() + stringRedisTemplate.opsForValue().get("first");
    }

    @RequestMapping(value = "/getRedisUtil")
    public String getRedisUtil(){
        redisUtil.set("first","方翔鸣");
        redisUtil.set("second","于欣欣");
        redisUtil.set("three","林就远");
        return redisUtil.get("first")+" "+redisUtil.get("second")+" "+redisUtil.get("three");
    }


}
