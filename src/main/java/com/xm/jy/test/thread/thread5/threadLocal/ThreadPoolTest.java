package com.xm.jy.test.thread.thread5.threadLocal;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @auther 方翔鸣
 * @date 2020/3/10 20:34
 */
public class ThreadPoolTest {
//    private static Executors executors;

    @Autowired
    private static Executors executors;

    public static void main(String[] args) {
        ExecutorService executorService = executors.newSingleThreadExecutor();
        ExecutorService fixedThreadPool = executors.newFixedThreadPool(6);
        ExecutorService cachedThreadPool = executors.newCachedThreadPool();
        ScheduledExecutorService scheduledThreadPool = executors.newScheduledThreadPool(6);
        for (int i = 0; i < 2; i++) {
            executorService.submit(() -> {
                System.out.println("what is single "+Thread.currentThread().getId());
            });
        }
        System.out.println("fixed 遍历");
        for (int i = 0; i < 2; i++) {
            fixedThreadPool.submit(() -> {
                System.out.println("what is fixed "+Thread.currentThread().getId());
            });
        }

        System.out.println("cached 遍历");
        for (int i = 0; i < 2; i++) {
            cachedThreadPool.submit(() -> {
                System.out.println("what is cached " + Thread.currentThread().getId());
            });
        }
        System.out.println("scheduled 遍历");
        for (int i = 0; i < 2; i++) {
            scheduledThreadPool.submit(() -> {
                System.out.println("what is scheduled " +Thread.currentThread().getId());
            });
        }

    }
}
