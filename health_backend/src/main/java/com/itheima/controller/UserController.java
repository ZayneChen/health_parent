package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZayneChen
 * @date 2022年07月07日 22:45
 */
@RequestMapping("/user")
@RestController
public class UserController {
    // 获得当前用户的同户名
    @RequestMapping("/getUsername")
    public Result getUsername()throws Exception{
        try{
            // 当SpringSecurity完成认真后，会将用户信息保存到框架提供的上下文对象
            org.springframework.security.core.userdetails.User user =
                    (org.springframework.security.core.userdetails.User)
                            SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return new Result(true, MessageConstant.GET_USERNAME_SUCCESS,user.getUsername());
        }catch (Exception e){
            return new Result(false, MessageConstant.GET_USERNAME_FAIL);
        }
    }
}
