package com.atguigu.spring6.iocxml.auto.controller;

import com.atguigu.spring6.iocxml.auto.service.UserService;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 15:21
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("Controller里面的方法执行了");
        userService.addUserService();
    }
}
