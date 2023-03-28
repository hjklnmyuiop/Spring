package com.atguigu.spring6.aop.annoaop;

import org.springframework.stereotype.Component;

/**
 * @Author: dev_guo
 * @Date: 2023/3/28 11:09
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }


    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
