package com.xm.practice.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author: albert.fang
 * @date: 2021/5/14 13:51
 * @description: 字符串组件
 */
@Component
public class StringComponents {

    @Bean
    public String getAWord(){
        return "返回一句话";
    }

    @Bean
    @Primary
    public String getAnotherWord(){
        return "返回另一句话";
    }

    public void getVoid(){
        System.out.println("打印一句话：need to have a non-void return type");
    }
}
