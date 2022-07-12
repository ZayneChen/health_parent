package com.itheima.dao;

import com.itheima.pojo.User;

/**
 * @author ZayneChen
 * @date 2022年07月07日 21:19
 */
public interface UserDao {
    User findByUsername(String username);
}
