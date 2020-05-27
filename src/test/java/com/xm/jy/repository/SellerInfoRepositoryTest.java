package com.xm.jy.repository;

import com.xm.jy.model.Seller_Info;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Test
    public void findByOpenid() {
        Seller_Info byOpenid = sellerInfoRepository.findByOpenid("o9AREv8WgDU5-_l-qbwjn0b8bVfw");
        System.out.println(byOpenid.toString());
    }

    @Test
    public void save(){
        Seller_Info sellerInfo = new Seller_Info();
        sellerInfo.setOpenid("all");
        sellerInfo.setSellerId("all");
        sellerInfo.setUsername("test");
        sellerInfo.setPassword("test");
        Seller_Info sellerInfo1 = sellerInfoRepository.save(sellerInfo);
        Assert.assertNotNull(sellerInfo1);
    }

    @Test
    public void modify(){
        Seller_Info sellerInfo = sellerInfoRepository.findOne("test");
        sellerInfo.setPassword("update or not ");
        sellerInfo.setUsername("update or not ");
        sellerInfoRepository.save(sellerInfo);
    }

    @Test
    public void findAll(){
        List<Seller_Info> sellerInfos = sellerInfoRepository.findAll();
        for (Seller_Info sellerInfo : sellerInfos) {
            System.out.println(sellerInfo.getUsername());
        }
    }

    @Test
    public void deleteOne(){
        sellerInfoRepository.delete("test");
    }
}