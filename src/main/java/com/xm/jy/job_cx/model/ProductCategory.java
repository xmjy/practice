package com.xm.jy.job_cx.model;

import lombok.Data;

import java.util.Date;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 17:32
 */

@Data
public class ProductCategory {
    /** 类目id. */
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date updateTime;

    private Date createTime;

}
