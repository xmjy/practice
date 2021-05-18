package com.xm.jy.job_cx.service;

import com.xm.jy.job_cx.model.ProductCategory;

import java.util.List;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 17:47
 */
public interface ProductCategoryService {
    ProductCategory getProductCategoryByTypeId(Integer typeId);

    List<ProductCategory> selectAll(Integer pageNum, Integer pageSize);

    Integer count();
}
