package com.xm.practice.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: albert.fang
 * @date: 2021/5/14 14:02
 * @description: bean工具类
 */
public class BeanUtils {
    public static ApplicationContext applicationContext;
    public static <T> T getBean(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }
}
