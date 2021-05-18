package com.xm.jy.job_cx.dao;

import com.xm.jy.job_cx.model.STeamDimensionScore;

public interface STeamDimensionScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(STeamDimensionScore record);

    int insertSelective(STeamDimensionScore record);

    STeamDimensionScore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(STeamDimensionScore record);

    int updateByPrimaryKey(STeamDimensionScore record);
}