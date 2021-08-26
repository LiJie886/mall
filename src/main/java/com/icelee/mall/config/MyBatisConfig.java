package com.icelee.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: mybatis配置
 * @author: lijie
 * @date: 2021.08.18 11:04
 */
@Configuration
@MapperScan("com.icelee.mall.mapper")
public class MyBatisConfig {
}
