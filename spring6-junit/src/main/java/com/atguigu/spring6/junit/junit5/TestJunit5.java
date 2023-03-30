package com.atguigu.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author: dev_guo
 * @Date: 2023/3/28 17:29
 */
//    @ExtendWith(SpringExtension.class)
//    @ContextConfiguration("classpath:bean.xml")
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJunit5 {
    @Autowired
    private User user;
    @Test
    public void testUser(){
        System.out.println(user);
        user.run();
    }
}
