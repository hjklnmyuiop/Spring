package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 14:02
 */
@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao redis......");
    }
}
