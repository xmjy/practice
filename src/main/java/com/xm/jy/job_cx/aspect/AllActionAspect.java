package com.xm.jy.job_cx.aspect;

import com.xm.jy.test.ioc.config.DayDayUpConfig;
import com.xm.jy.test.ioc.config.GoodGoodStudyConfig;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: albert.fang
 * @date: 2020/5/28 17:51
 * @description: 任何接口，执行之后都要走的方法
 */
//@Aspect
//@Component
public class AllActionAspect {

//    @Resource
//    private GoodGoodStudyConfig goodGoodStudyConfig;
//
//    @Resource
//    private DayDayUpConfig dayDayUpConfig;
//
//    @Pointcut("execution(public * com.xm.jy.job_51.controller.*.*(..))"
//            + "&& execution(public * com.xm.jy.job_cx.controller.*.*(..))")
//    public void allAction(){}
//
//    @After("allAction()")
//    public void printEncourageMyself(){
//        System.out.println(goodGoodStudyConfig.encourageSelf()+dayDayUpConfig.believeMe());
//    }
}
