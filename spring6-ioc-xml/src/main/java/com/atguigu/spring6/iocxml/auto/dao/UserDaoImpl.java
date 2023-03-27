package com.atguigu.spring6.iocxml.auto.dao;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 15:01
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("userDao里面的方法执行了");
    }
}
