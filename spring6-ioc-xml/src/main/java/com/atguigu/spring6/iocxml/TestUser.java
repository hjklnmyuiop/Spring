package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 14:17
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //1.根据id获取
        User user =(User) context.getBean("user");
        System.out.println("根据ID获取bean"+user);
        //2.根据类型获取
//        User user2 = context.getBean(User.class);
//        System.out.println("根据类型获取bean"+user2);
//        //2.根据id+类型获取
//        User user3 = context.getBean("user",User.class);
//        System.out.println("根据id+类型获取bean"+user3);
    }
}
