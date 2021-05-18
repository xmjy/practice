package com.xm.jy.job_51.controller;

import com.xm.jy.job_51.dto.UserDTO;
import com.xm.jy.job_51.request.LoginRequest;
import com.xm.jy.job_51.vo.UserVO;
import com.xm.jy.job_cx.model.User;
import com.xm.jy.job_cx.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:05
 * @description: 登录页面，同时也是首页，需要进行判断和拦截才能访问其他页面
 */
@Controller
@RequestMapping("/51/login")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录逻辑（cookie）：
     * 1、根据用户名和密码去匹配用户，匹配到则继续第二步
     * 2、将登录信息写进Cookie
     * 3、登陆成功，跳转到首页
     * 登录逻辑（session）：
     * 1、用户第一次访问服务器，通过request.getSession创建session。
     * 2、并生成名为JSESSIONID的cookie返回给客户端（这步是自动的）。
     * 3、往session塞自己想要塞进去的键值对，通过setAttribute(key,value)（这步看自己的需求）。
     * @param request
     * @param map
     * @return
     */
    @RequestMapping(value = "/loginIn")
    public ModelAndView loginIn(@Validated LoginRequest request,
                                Map<String,Object> map, HttpServletRequest servletRequest, HttpServletResponse response) throws UnsupportedEncodingException {
        User user = userService.gainUserByNameAndPassword(request.getUserName(),request.getPassword());
        HttpSession session = servletRequest.getSession();
        String code = (String) session.getAttribute("verifyCode");
        // 校验验证码
        if (!code.toUpperCase().equals(request.getCode().toUpperCase())){
            map.put("request",request);
            map.put("message","验证码信息错误");
            return new ModelAndView("error/loginError",map);
        }
        if (user != null){
            // 将用户信息存储在服务端的session上（键值对形式）
            session.setAttribute("user",user);
            // 用session实现cookie完成的所有功能，暂时注释掉cookie相关代码
//            CookieUtil.set(response,ProjectConstant.TOKEN_USERNAME, URLEncoder.encode(user.getUserName(), "utf-8"), ProjectConstant.ONE_DAY_SECONDS * request.getManyDays());
//            CookieUtil.set(response,ProjectConstant.TOKEN_PASSWORD,user.getUserPassword(),ProjectConstant.ONE_DAY_SECONDS * request.getManyDays());
            return new ModelAndView("51job/index");
        }
        map.put("request",request);
        map.put("message","用户名，密码错误");
        return new ModelAndView("error/loginError",map);
    }


    /**
     * 注册逻辑：
     * 1、根据传进来的用户名去数据库查，存在则不允许，不存在的话执行第二步逻辑
     * 2、插入用户注册信息
     * @param userVO
     * @return
     */
    @RequestMapping(value = "/register")
    public ModelAndView register(UserVO userVO,Map<String,Object> map) throws Exception {
        User user = userService.gainUserByName(userVO.getUserName());
        if (user != null){
            map.put("message","用户名已存在");
            // 注册失败，不直接跳转注册页面，通过中间页面实现跳转（因为要返回具体的注册失败信息）
            return new ModelAndView("error/registerError",map);
        }
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userVO,userDTO);
        userService.addUser(userDTO);
        // 注册成功，跳转到用户登录页面
        return new ModelAndView("51job/login");
    }

    /**
     * 退出登录，逻辑（cookie）：
     * 1、清空客户端相应的cookie值（把MaxAge设为0）
     * 2、返回到登录页面
     * 退出登录，逻辑（session）：
     * 1、通过request.getSession()获取session
     * 2、通过session.invalidate()将该session“消亡”
     * @return
     */
    @RequestMapping(value = "/loginOut")
    public ModelAndView loginOut(HttpServletRequest request,HttpServletResponse response){
        // 从客户端发送过来的请求中获取到相应名字的cookie
        // 用session实现cookie完成的所有功能，暂时注释掉cookie相关代码
        /*Cookie cookieName = CookieUtil.get(request,ProjectConstant.TOKEN_USERNAME);
        Cookie cookiePassword = CookieUtil.get(request,ProjectConstant.TOKEN_PASSWORD);
        if (cookieName != null && cookiePassword != null){
            // 将重设生命时长的cookie塞回response里，返回给客户端
            CookieUtil.set(response,cookieName.getName(),null,0);
            CookieUtil.set(response,cookiePassword.getName(),null,0);
        }*/
        HttpSession session = request.getSession();
        session.invalidate();
        return new ModelAndView("51job/login");
    }

}
