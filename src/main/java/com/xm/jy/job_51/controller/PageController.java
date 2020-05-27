package com.xm.jy.job_51.controller;

import com.xm.jy.job_51.page.Page;
import com.xm.jy.job_51.vo.ProductCategoryVO;
import com.xm.jy.model.ProductCategory;
import com.xm.jy.service.ProductCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: albert.fang
 * @date: 2020/4/23 13:40
 * @description: 页面跳转的controller
 */
@Controller
@RequestMapping(value = "/51/page")
public class PageController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/toIndex")
    public String toIndex(){
        return "51job/index";
    }

    /**
     * 对index2这个页面的数据进行分页
     * @param pageNum
     * @param pageSize
     * @param map
     * @return
     */
    @RequestMapping(value = "/index2Paging")
    public ModelAndView index2Paging(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "pageSize",defaultValue = "2") Integer pageSize,
                                 Map<String, Object> map){
        List<ProductCategory> productCategories = productCategoryService.selectAll((pageNum-1)*pageSize,pageSize);
        // 得到总记录数
        Integer count = productCategoryService.count();
        List<ProductCategoryVO> productCategoryVOS = new ArrayList<>();
        for (ProductCategory productCategory : productCategories) {
            ProductCategoryVO productCategoryVO = new ProductCategoryVO();
            BeanUtils.copyProperties(productCategory,productCategoryVO);
            productCategoryVOS.add(productCategoryVO);
        }
        Page<ProductCategoryVO> voPage = new Page<>();
        voPage.setCurrentPage(pageNum);
        voPage.setPageSize(pageSize);
        voPage.setTotalCount(count);
        voPage.setTotalPage((int)Math.ceil((float)count/voPage.getPageSize()));
        voPage.setTList(productCategoryVOS);
        map.put("voPage",voPage);
        return new ModelAndView("51job/index2",map);
    }

    @RequestMapping(value = "/toLoginPage")
    public ModelAndView toLoginPage(){
        return new ModelAndView("51job/login");
    }

    @RequestMapping(value = "/toRegisterPage")
    public ModelAndView toRegisterPage(){
        return new ModelAndView("51job/register");
    }
}
