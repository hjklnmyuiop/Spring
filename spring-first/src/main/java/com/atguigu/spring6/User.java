package com.atguigu.spring6;

/**
 * @Author: dev_guo
 * @Date: 2023/3/21 17:50
 */
public class User {
    private Person person;
    public User(){
        System.out.println("0:无参数构造执行");
    }
    public void add(){
        System.out.println("add ...");
    }

}
