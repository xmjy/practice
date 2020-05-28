package com.xm.jy.test.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: albert.fang
 * @date: 2020/5/28 17:19
 * @description: 从今天开始，有计划的学习，mark 2020/5/28 17:19
 */
@Configuration
public class GoodStudyConfig {

    @Bean(name = "encourageSelf")
    public static String encourageSelf(){
        return "\033[31;0m"+"从今天开始，有计划的学习，mark 2020/5/28 17:19......";
    }

    @Bean(name = "believeMe")
    public static String believeMe(){
        return "相信我，这次绝非是口头说说而已......"+"\033[0m";
    }
}
