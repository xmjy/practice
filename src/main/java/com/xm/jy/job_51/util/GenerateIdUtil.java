package com.xm.jy.job_51.util;

import java.util.UUID;

/**
 * @author: albert.fang
 * @date: 2020/4/27 9:33
 * @description: 生成主键的工具类
 */
public class GenerateIdUtil {
    public static String generateId(){
        String id = "";
        for (String s : UUID.randomUUID().toString().split("-")) {
            id += s;
        }
        return id;
    }
}
