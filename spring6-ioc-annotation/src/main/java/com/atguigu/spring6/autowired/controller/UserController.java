package com.atguigu.spring6.autowired.controller;

import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 11:28
 */
@Controller
public class UserController {
//    //注入service
//    @Autowired //根据类型找到对应实现对象，完成注入
//    private UserService userService;
    //第二种方式 set 方法注入
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
    //第三种方式 构造方法注入
//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
    //场景四：形参上注入
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }
    //场景五：只有一个构造函数，无注解
//    private UserService userService;
//    @Autowired
//    public UserController( UserService userService) {
//        this.userService = userService;
//    }



    public void add(){
        System.out.println("controller....");
        userService.add();
    }
}
