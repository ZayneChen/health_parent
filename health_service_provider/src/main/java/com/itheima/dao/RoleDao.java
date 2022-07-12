package com.itheima.dao;

import com.itheima.pojo.Role;

import java.util.Set;

/**
 * @author ZayneChen
 * @date 2022年07月07日 21:24
 */
public interface RoleDao {
    Set<Role> findByUserId(Integer userId);
}
