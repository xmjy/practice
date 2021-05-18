package com.xm.jy.test.io;

import com.xm.jy.async.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.Duration;
import java.time.Instant;

/**
 * @author: albert.fang
 * @date: 2020/11/27 10:32
 * @description: 异步调用
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncTest {

    @Resource
    private AsyncTask asyncTask;

    @Test
    public void print(){
        Instant begin = Instant.now();
        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        Instant end = Instant.now();
        System.out.printf("执行3个任务，共耗时：【%s】ms", Duration.between(begin,end).toMillis());
    }


}
