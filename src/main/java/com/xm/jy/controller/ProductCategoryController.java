package com.xm.jy.controller;

import com.xm.jy.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 17:49
 */
//@RestController
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/getCategory")
    public String obtainProductCategory(Integer typeId){
        return productCategoryService.getProductCategoryByTypeId(typeId).toString();
    }
}
