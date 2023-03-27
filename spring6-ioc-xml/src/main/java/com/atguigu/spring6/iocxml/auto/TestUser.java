package com.atguigu.spring6.iocxml.auto;

import com.atguigu.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 16:38
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
