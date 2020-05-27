package com.xm.jy.configurationfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.executable.ValidateOnExecution;

/**
 * @auther 方翔鸣
 * @date 2020/3/4 20:14
 */
@RestController
public class ReadYAMLConfigurationTest {

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/jdbc")
    public String getJdbcUrl(){
        return jdbcUrl;
    }
}
