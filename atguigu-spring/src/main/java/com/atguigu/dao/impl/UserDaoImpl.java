package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;

/**
 * @Author: dev_guo
 * @Date: 2023/3/25 17:36
 */
@Bean
public class UserDaoImpl  implements UserDao {

    @Override
    public void add() {
        System.out.println("dao.......");
    }

}
