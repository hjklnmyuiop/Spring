package com.atguigu.spring6.resource.service;

import com.atguigu.spring6.resource.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 11:27
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao myUserDao;
    @Override
    public void add() {
        System.out.println("service.....");
        myUserDao.add();
    }
}
