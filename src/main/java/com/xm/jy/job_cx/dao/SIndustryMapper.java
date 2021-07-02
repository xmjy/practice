package com.xm.jy.job_cx.dao;

import com.xm.jy.job_cx.model.SIndustry;

public interface SIndustryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SIndustry record);

    int insertSelective(SIndustry record);

    SIndustry selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SIndustry record);

    int updateByPrimaryKey(SIndustry record);
}