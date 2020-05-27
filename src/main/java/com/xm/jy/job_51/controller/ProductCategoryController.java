package com.xm.jy.job_51.controller;

import com.xm.jy.job_51.result.Result;
import com.xm.jy.job_51.vo.ProductCategoryVO;
import com.xm.jy.model.ProductCategory;
import com.xm.jy.service.ProductCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: albert.fang
 * @date: 2020/4/23 13:35
 * @description: 51job
 */
@Controller
@RequestMapping(value = "/51")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/getAllProductCategory")
    @ResponseBody
    public Result getAllProductCategory(Integer pageNum, Integer pageSize){
        List<ProductCategory> productCategories = productCategoryService.selectAll((pageNum-1)*pageSize,pageSize);
        // 得到总记录数
        Integer count = productCategoryService.count();
        List<ProductCategoryVO> productCategoryVOS = new ArrayList<>();
        for (ProductCategory productCategory : productCategories) {
            ProductCategoryVO productCategoryVO = new ProductCategoryVO();
            BeanUtils.copyProperties(productCategory,productCategoryVO);
            productCategoryVOS.add(productCategoryVO);
        }
        return Result.success("成功",count,productCategoryVOS);
    }

}
