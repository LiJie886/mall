package com.icelee.mall.service;

import com.icelee.mall.entity.PmsBrand;

import java.util.List;

/**
 * @Description: pmsbrand服务
 * @author: lijie
 * @date: 2021.08.18 13:38
 */
public interface PmsBrandService {
    int insertPmsBrand(PmsBrand brand);

    int deletePmsBrand(Long id);

    int updatePmsBrand(Long id, PmsBrand record);

    List<PmsBrand> listAllPmsBrand();

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}