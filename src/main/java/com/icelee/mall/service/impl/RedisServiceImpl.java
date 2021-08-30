package com.icelee.mall.service.impl;

import com.icelee.mall.service.RedisService;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description: redis操作Service的实现类
 * @author: lijie
 * @date: 2021.08.18 20:54
 */
@Service
@Log4j2
public class RedisServiceImpl implements RedisService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;
//新增一个字符串类型的值，key是键，value是值。
    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
//取value
    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
//返回key的剩余的过期时间，单位为秒
    @Override
    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }
//增量
    @Override
    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key, delta);
    }
}
