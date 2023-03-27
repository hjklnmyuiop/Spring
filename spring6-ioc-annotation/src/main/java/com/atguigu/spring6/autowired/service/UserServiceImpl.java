package com.atguigu.spring6.autowired.service;

import com.atguigu.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 11:27
 */
@Service
public class UserServiceImpl implements UserService {
    //1.注入dao
//    @Autowired
//    private UserDao userDao;
//    private UserDao userDao;
//    2.
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    //最后方式 两个注解 根据名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;
    @Override
    public void add() {
        System.out.println("service.....");
        userDao.add();
    }
}
