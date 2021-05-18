package com.xm.jy.job_51.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: albert.fang
 * @date: 2020/4/28 11:31
 * @description: 项目路径——配置类
 */
@Component
@Data
@ConfigurationProperties(prefix = "projectUrl")
public class ProjectUrlConfig {

    private String yxx;

}
