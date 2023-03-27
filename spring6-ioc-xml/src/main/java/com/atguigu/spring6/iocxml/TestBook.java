package com.atguigu.spring6.iocxml;

import com.atguigu.spring6.iocxml.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 15:02
 */
public class TestBook {
    @Test
    public void testSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
    }
    @Test
    public void testConstructor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookCon",Book.class);
        System.out.println(book);
    }
}
