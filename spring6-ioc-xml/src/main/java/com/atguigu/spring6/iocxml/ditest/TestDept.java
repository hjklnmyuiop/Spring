package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 18:10
 */
public class TestDept {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();

    }
}
