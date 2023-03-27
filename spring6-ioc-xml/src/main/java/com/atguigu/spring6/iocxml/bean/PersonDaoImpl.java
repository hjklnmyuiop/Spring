package com.atguigu.spring6.iocxml.bean;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 14:44
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("persion run....");
    }
}
