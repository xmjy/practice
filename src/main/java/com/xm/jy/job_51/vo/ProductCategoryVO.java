package com.xm.jy.job_51.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:12
 * @description: 用于浏览器展示的VO层productCategory数据（controller层和页面之间的数据流动，返回给页面的）
 */
@Data
public class ProductCategoryVO {
    /** 类目id. */
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date updateTime;

    private Date createTime;

    private String name;
}
