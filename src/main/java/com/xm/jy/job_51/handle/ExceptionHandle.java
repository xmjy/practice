package com.xm.jy.job_51.handle;

import com.xm.jy.job_51.exception.LoginException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: albert.fang
 * @date: 2020/4/29 11:51
 * @description: 异常拦截处理
 */
@ControllerAdvice
public class ExceptionHandle {


    @ExceptionHandler(value = LoginException.class)
    public ModelAndView toLoginPage(){
        return new ModelAndView("51job/login");
    }

}
