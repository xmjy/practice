package com.xm.jy.controller;

import com.xm.jy.model.Seller_Info;
import com.xm.jy.service.SellerInfoSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 17:03
 */
@Controller
public class SellerInfoController {
    @Autowired
    private SellerInfoSevice sellerInfoSevice;

    @RequestMapping(value = "/getById")
    @ResponseBody
    public String obtainSellerById(String id){
        Seller_Info sellerInfo = sellerInfoSevice.getSellInfoById(id);
        return sellerInfo.toString();
    }

    @RequestMapping(value = "/getByOpenid")
    @ResponseBody
    public String obtainSellerByOpenid(String openid){
        return sellerInfoSevice.getSellInfoByOpenid(openid).toString();
    }
}
