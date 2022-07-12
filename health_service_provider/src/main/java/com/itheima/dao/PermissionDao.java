package com.itheima.dao;

import com.itheima.pojo.Permission;

import java.util.Set;

/**
 * @author ZayneChen
 * @date 2022年07月07日 21:28
 */
public interface PermissionDao {
    Set<Permission> findByRoleId(Integer roleId);
}
