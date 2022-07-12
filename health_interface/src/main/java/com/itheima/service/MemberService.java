package com.itheima.service;

import com.itheima.pojo.Member;

import java.util.List;

/**
 * @author ZayneChen
 * @date 2022年07月06日 9:56
 */
public interface MemberService {
    void add(Member member);
    // 根据手机号查询会员
    Member findByTelephone(String telephone);

    List<Integer> findMemberCountByMonth(List<String> list);
}
