package com.icelee.mall.mapper;

import com.icelee.mall.entity.PmsBrand;

import java.util.List;


public interface PmsBrandMapper {


    int insert(PmsBrand record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    List<PmsBrand> selectAllPmsBrand();

    int insertSelective(PmsBrand record);

    int updateByPrimaryKeySelective(PmsBrand record);

}