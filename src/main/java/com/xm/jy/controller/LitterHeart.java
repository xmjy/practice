package com.xm.jy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: LitterHeart
 * @Description: 类的作用描述
 * @Author: 方翔鸣
 * @CreateDate: 2019/11/4 18:41
 */
@Controller
public class LitterHeart {

    @RequestMapping(value = "/heart")
    public String getLitterHeart(){
        return "heart";
    }

    @RequestMapping(value = "/index")
    public String getIndex(){
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "/gm")
    public String getXXX(String a,Integer b,Float c,Double d,Character e,Byte f,Short g,Long h,boolean i){
//        System.out.println(a);
        return "干嘛";
    }
}
