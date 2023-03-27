package com.atguigu.spring6.iocxml.life;

import com.atguigu.spring6.iocxml.scope.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 14:31
 */
public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        //1.根据id获取
        User user =(User) context.getBean("user",User.class);
        System.out.println("6 bean对象就绪可以使用");
        System.out.println(user);
        context.close();
    }
}
