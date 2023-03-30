package com.atguigu.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 11:51
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objects = new Object[]{"atguigu",new Date().toString()};
        String message = context.getMessage("www.atguigu.com", objects, Locale.CHINA);
        System.out.println(message);
    }
}
