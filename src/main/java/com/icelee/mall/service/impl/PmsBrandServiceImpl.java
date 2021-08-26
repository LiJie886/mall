package com.icelee.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.icelee.mall.entity.PmsBrand;
import com.icelee.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icelee.mall.mapper.PmsBrandMapper;
import java.util.List;

/**
 * @Description: pmsbrand接口实现
 * @author: lijie
 * @date: 2021.08.18 13:40
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public int insertPmsBrand(PmsBrand brand) {
        return pmsBrandMapper.insertSelective(brand);
    }

    @Override
    public int deletePmsBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updatePmsBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public List<PmsBrand> listAllPmsBrand() {
        return pmsBrandMapper.selectAllPmsBrand();
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return pmsBrandMapper.selectAllPmsBrand();
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
