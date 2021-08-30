package com.icelee.mall.mapper;

import com.icelee.mall.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 搜索系统中的商品管理自定义Dao
 * @author: lijie
 * @date: 2021.08.30 16:55
 */
@Mapper
public interface EsProductMapper {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
