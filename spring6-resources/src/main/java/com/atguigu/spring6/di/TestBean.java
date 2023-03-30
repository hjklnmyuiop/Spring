package com.atguigu.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 9:55
 */
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean-di.xml");
        ResourceBean resourceBean = context.getBean(ResourceBean.class);
        resourceBean.parse();
    }
}
