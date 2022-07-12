package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @author ZayneChen
 * @date 2022年07月07日 20:15
 */
public interface UserService {
    User findByUsername(String username);
}
