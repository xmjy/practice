package com.xm.jy.test.redis;

import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * @author: albert.fang
 * @date: 2020/8/3 17:10
 * @description: 连接、操作redis
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = RedisConnectPool.getConnection();
        System.out.println(jedis.ttl("key1"));
        jedis.close();
    }

    // 随机生成一个长度为6的字符串
    public static String getRandomString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int j = random.nextInt(25) + 97;
            char zf = (char) j;
            sb.append(zf);
        }
        return sb.toString();
    }
}
