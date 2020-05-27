package com.xm.jy.job_51.controller;

import com.xm.jy.job_51.constant.ProjectConstant;
import com.xm.jy.job_51.interface_51.IVerifyCodeGen;
import com.xm.jy.job_51.interface_51.impl.SimpleCharVerifyCodeGenImpl;
import com.xm.jy.job_51.util.VerifyCodeUtil;
import com.xm.jy.job_51.vo.VerifyCodeVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author: albert.fang
 * @date: 2020/5/6 16:54
 * @description: 生成验证码的类
 */
@Controller
@RequestMapping(value = "verifyCode")
public class VerifyCodeController {

    /**
     * 网上找的
     * @param request
     * @param response
     */
    @GetMapping("/generateVerifyCode")
    public void generateVerifyCode(HttpServletRequest request, HttpServletResponse response) {
        IVerifyCodeGen iVerifyCodeGen = new SimpleCharVerifyCodeGenImpl();
        try {
            //设置长宽
            VerifyCodeVO verifyCode = iVerifyCodeGen.generate(80, 28);
            String code = verifyCode.getCode();
            //将VerifyCode绑定session
            request.getSession().setAttribute("VerifyCode", code);
            // 设置该session最大超时时间（客户端没有和服务器交互的时间）
            request.getSession().setMaxInactiveInterval(3600);
            //设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            //在代理服务器端防止缓冲
            response.setDateHeader("Expires", 0);
            //设置响应内容类型,告诉浏览器，输出的内容为图片
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCode.getImgBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 自己写的
     * @param request
     * @param response
     */
    @RequestMapping(value = "/verifyCodeBySelf")
    public void verifyCodeBySelf(HttpServletRequest request,HttpServletResponse response){
        BufferedImage image = new BufferedImage(80,28,BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.fillRect(0,0,80,28);
        VerifyCodeUtil.generateRandomLine(graphics,80,28);
        Random random = new Random();
        char[] chars = VerifyCodeUtil.getRandChars();
        String verifyCode = "";
        for (int i = 0; i < chars.length; i++) {
            // 拼接验证码
            verifyCode =verifyCode + chars[i];
            // 设置字体颜色
            graphics.setColor(VerifyCodeUtil.randomColor());
            // 设置字体类型
            graphics.setFont(new Font(ProjectConstant.FONT_TYPES[random.nextInt(ProjectConstant.FONT_TYPES.length)], Font.BOLD, 26));
            // 设置字体的x,y坐标
            graphics.drawString(String.valueOf(chars[i]),5+20*i,19+random.nextInt(8));
        }
        // 将验证码写进session里（登录用做校验）
        request.getSession().setAttribute("verifyCode",verifyCode);
        // 设置session超时时间
        request.getSession().setMaxInactiveInterval(3600);
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        //在代理服务器端防止缓冲
        response.setDateHeader("Expires", 0);
        //设置响应内容类型,告诉浏览器，输出的内容为图片
        response.setContentType("image/jpeg");
        try {
            // 将image放到response的输出流中，图片的格式为jpeg
            ImageIO.write(image,"JPEG",response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
