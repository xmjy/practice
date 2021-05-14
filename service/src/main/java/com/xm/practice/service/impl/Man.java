package com.xm.practice.service.impl;

import com.xm.practice.service.Human;
import org.springframework.stereotype.Service;

/**
 * @author: albert.fang
 * @date: 2021/5/14 15:41
 * @description: 男人
 */
@Service
public class Man implements Human {

    @Override
    public void say(){
        System.out.println("I'm man");
    }
}
