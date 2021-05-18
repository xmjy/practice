package com.xm.jy.test.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: albert.fang
 * @date: 2020/8/11 15:02
 * @description: 日志测试，占位符
 */
public class LogTest {
    static Logger logger = LoggerFactory.getLogger(LogTest.class);
    public static void main(String[] args) {
        logger.info("[{}],你好帅","方翔鸣");
    }
}
