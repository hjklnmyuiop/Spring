package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 11:28
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao.....");
    }
}
