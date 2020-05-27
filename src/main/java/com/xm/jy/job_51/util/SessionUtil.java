package com.xm.jy.job_51.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: albert.fang
 * @date: 2020/5/6 13:07
 * @description: Session工具类（Session是保存在服务端的）
 */
public class SessionUtil {

    public static void set(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("1","232323");

    }

}
