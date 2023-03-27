package com.atguigu.spring6.iocxml.factoryBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 14:47
 */
public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        //1.根据id获取
        User user =(User) context.getBean("myFactoryBean");
        System.out.println(user);
    }
}
