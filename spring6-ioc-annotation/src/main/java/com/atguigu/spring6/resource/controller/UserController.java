package com.atguigu.spring6.resource.controller;

import  com.atguigu.spring6.resource.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 11:28
 */
@Controller("myUserController")
public class UserController {
    //根据名称进行注入
    @Resource(name = "myUserService")
    private UserService userService;

    public void add(){
        System.out.println("controller....");
        userService.add();
    }
}
