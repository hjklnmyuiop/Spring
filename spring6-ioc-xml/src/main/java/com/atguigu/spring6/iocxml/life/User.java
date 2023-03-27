package com.atguigu.spring6.iocxml.life;

/**
 * @Author: dev_guo
 * @Date: 2023/3/23 14:25
 */
public class User {
    //
    private String name;

    public User() {
        System.out.println("1 bean对象创建（调用无参构造器）");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 给bean对象设置属性");
        this.name = name;
    }
    //初始化方法
    public void initMethod(){
        System.out.println("4 bean对象初始化（需在配置bean时指定初始化方法）");
    }
    //销毁方法
    public void destroyMethod(){
        System.out.println("7 bean对象销毁（需在配置bean时指定销毁方法）");
    }
}
