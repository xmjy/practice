package com.xm.jy.service;

import com.xm.jy.model.Seller_Info;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 17:00
 */
public interface SellerInfoSevice {
    Seller_Info getSellInfoById(String id);
    Seller_Info getSellInfoByOpenid(String openid);
}
