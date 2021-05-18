package com.xm.jy.job_cx.repository;

import com.xm.jy.job_cx.model.Seller_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 16:30
 */
@Repository
public interface SellerInfoRepository extends JpaRepository<Seller_Info,String> {

    Seller_Info findByOpenid(String openid);
}
