package com.icelee.mall.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 后台用户与角色管理自定义Dao
 * @author: lijie
 * @date: 2021.08.19 16:03
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<entity.UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
