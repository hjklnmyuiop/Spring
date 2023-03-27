package com.atguigu.spring6.iocxml.scope;

import com.atguigu.spring6.iocxml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 14:15
 */
public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        //1.根据id获取
        Orders orders =(Orders) context.getBean("orders",Orders.class);
        System.out.println(orders.toString());
        Orders orders1 =(Orders) context.getBean("orders",Orders.class);
        System.out.println(orders1);
    }
}
