package com.itheima.service;

import com.itheima.entity.Result;

import java.util.Map;

/**
 * @author ZayneChen
 * @date 2022年07月05日 22:02
 */
public interface OrderService {
    Result order(Map map) throws Exception;

    Map findById(Integer id) throws Exception;
}
