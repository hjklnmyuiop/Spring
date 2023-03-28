package com.atguigu.spring6.aop.example;

/**
 * @Author: dev_guo
 * @Date: 2023/3/27 18:24
 */
public class TestCal {
    public static void main(String[] args) {
        //创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy =(Calculator) proxyFactory.getProxy();
        proxy.add(2,3);
    }
}
