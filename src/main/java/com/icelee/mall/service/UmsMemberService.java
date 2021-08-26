package com.icelee.mall.service;

import com.icelee.mall.common.api.CommonResult;

/**
 * @Description: 会员管理Service
 * @author: lijie
 * @date: 2021.08.18 21:02
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}