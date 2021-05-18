package com.xm.jy.async;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

/**
 * @author: albert.fang
 * @date: 2020/11/27 10:38
 * @description: 异步任务
 */
@Component
public class AsyncTask {

    private static Logger logger = LoggerFactory.getLogger(AsyncTask.class);

    @Async
    public void task1(){
        try {
            Thread.sleep(100);
            System.out.println("任务1，睡了100ms，再开始走");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    public void task2(){
        try {
            Thread.sleep(100);
            System.out.println("任务2，睡了100ms，再开始走");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    public void task3(){
        try {
            Thread.sleep(100);
            System.out.println("任务3，睡了100ms，再开始走");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
