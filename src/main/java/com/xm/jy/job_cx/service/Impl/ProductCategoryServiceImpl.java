package com.xm.jy.job_cx.service.Impl;

import com.xm.jy.job_cx.dao.ProductCategoryMapper;
import com.xm.jy.job_cx.model.ProductCategory;
import com.xm.jy.job_cx.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 17:48
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public ProductCategory getProductCategoryByTypeId(Integer typeId) {
        return productCategoryMapper.selectByCategoryType(typeId);
    }

    @Override
    public List<ProductCategory> selectAll(Integer pageNum, Integer pageSize) {
        return productCategoryMapper.selectAll(pageNum,pageSize);
    }

    @Override
    public Integer count() {
        return productCategoryMapper.count();
    }

}
