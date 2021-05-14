package com.xm.practice;

import com.xm.practice.utils.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author: albert.fang
 * @date: 2021/5/14 13:41
 * @description: 服务启动类
 */
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) {
        BeanUtils.applicationContext =  SpringApplication.run(ServiceApplication.class,args);
    }
}
