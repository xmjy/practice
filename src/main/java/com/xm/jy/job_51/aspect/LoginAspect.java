package com.xm.jy.job_51.aspect;

import com.xm.jy.job_51.exception.LoginException;
import com.xm.jy.job_cx.model.User;
import com.xm.jy.job_cx.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @author: albert.fang
 * @date: 2020/4/28 12:10
 * @description: 走除了登录和注册方法之前要判断的东西
 */
@Aspect
@Component
@Slf4j
public class LoginAspect {

    @Resource
    private UserService userService;

    @Pointcut("execution(public * com.xm.jy.job_51.controller.*.*(..) )"
                + " && !execution(public * com.xm.jy.job_51.controller.LoginController.*(..))"
                + " && !execution(public * com.xm.jy.job_51.controller.PageController.toLoginPage(..))"
                + " && !execution(public * com.xm.jy.job_51.controller.PageController.toRegisterPage(..))"
                + " && !execution(public * com.xm.jy.job_51.controller.VerifyCodeController.*(..))"
                + " && !execution(public * com.xm.jy.job_51.controller.IndexController.*(..))")
    public void verify(){}

    @Before("verify()")
    public void before() throws UnsupportedEncodingException {
        // 用session实现cookie完成的所有功能，暂时注释掉cookie相关代码
        /*ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Cookie cookieName = CookieUtil.get(request, ProjectConstant.TOKEN_USERNAME);
        Cookie cookiePassword = CookieUtil.get(request,ProjectConstant.TOKEN_PASSWORD);
        // 首先判断是否有cookie,无cookie直接抛出异常，跳转登录页面
        if (cookieName == null || cookiePassword == null){
            log.warn("【登录校验】 找不到相应cookie");
            throw new LoginException();
        }
        // 有cookie的话，根据cookie的值去查找相应用户
        User user = userService.gainUserByNameAndPassword(URLDecoder.decode(cookieName.getValue(),"utf-8"),cookiePassword.getValue());
        if (user == null){
            log.warn("【登录校验】 Cookie中的信息不正确");
            throw new LoginException();
        }*/

        // 用Session实现cookie完成的功能
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if (user == null){
            log.warn("【登录校验】找不到相应Session信息");
            throw new LoginException();
        }
//         总结session：客户端第一次访问服务端，服务端通过request.getSession()产生session，
//         并同时产生一个cookie名为JSESSIONID（该cookie的值就是session的id）返回给客户端,
//         客户端第二次访问服务端的时候回携带（浏览器自动携带）该cookie名为JSESSIONID的cookie到服务端
//         服务端根据该cookie的值（就是session的id）自动去匹配相应的session。
    }
}
