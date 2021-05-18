package com.xm.jy.job_51.page;

import lombok.Data;

import java.util.List;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:45
 * @description: 分页类
 */
@Data
public class Page<T> {
    // 当前页
    private Integer currentPage;

    // 页面大小
    private Integer pageSize;

    // 总页数
    private Integer totalPage;

    // 总记录数
    private Integer totalCount;

    // 每页的集合数据
    private List<T> tList;

}
