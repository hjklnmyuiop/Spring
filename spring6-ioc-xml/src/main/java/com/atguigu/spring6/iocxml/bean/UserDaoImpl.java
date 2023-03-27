package com.atguigu.spring6.iocxml.bean;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 14:37
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("run......");
    }
}
