package com.xm.practice.service.impl;

import com.xm.practice.service.Human;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author: albert.fang
 * @date: 2021/5/14 15:43
 * @description: 女人
 */
@Service
@Primary
public class Woman implements Human {
    @Override
    public void say() {
        System.out.println("I'm woman");
    }
}
