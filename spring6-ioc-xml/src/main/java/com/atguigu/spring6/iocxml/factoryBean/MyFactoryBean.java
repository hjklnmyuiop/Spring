package com.atguigu.spring6.iocxml.factoryBean;


import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 14:43
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
