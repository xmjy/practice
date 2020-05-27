package com.xm.jy.job_cx.dao;

import com.xm.jy.job_cx.model.TypeOrId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void selectByCategoryType() {
        System.out.println(mapper.selectByCategoryType(7).toString());
    }

    @Test
    public void selectOne(){
        System.out.println(mapper.selectOne(1,2));
        TypeOrId typeOrId = new TypeOrId();
        typeOrId.setCategoryId(1);
        typeOrId.setCategoryType(1);
        System.out.println(mapper.selectOneByObject(typeOrId).toString());

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("categoryId",2);
        hashMap.put("categoryType",2);
        System.out.println(mapper.selectOneByHashMap(hashMap).toString());
    }

//    @Test
//    public void selectAll(){
//        for (ProductCategory productCategory : mapper.selectAll(1,2)) {
//            System.out.println(productCategory.toString());
//        }
//    }

}