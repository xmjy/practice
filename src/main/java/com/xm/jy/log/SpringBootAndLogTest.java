package com.xm.jy.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther 方翔鸣
 * @date 2020/3/4 20:43
 */
@Controller
public class SpringBootAndLogTest {

    Logger logger = LoggerFactory.getLogger(SpringBootAndLogTest.class);

    @RequestMapping(value = "/testLog")
    public void testLog(){
        logger.info("学习springboot中使用slf4j做日志");
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SpringBootAndLogTest.class);
        logger.info("学习springboot中使用slf4j日志");
    }
}
