package com.atguigu.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Author: dev_guo
 * @Date: 2023/3/28 11:10
 */
@Aspect //切面类
@Component //ioc容器
public class LogAspect {
    //设置切入点
    //通知类型 ：
    // 前置
    @Before(value ="execution(public int com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))" )
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知,方法名称："+name+",参数："+args);
    }
    // 返回
    @AfterReturning(value = "execution(* com.atguigu.spring6..aop.annotation.CalculatorImpl.*(..))", returning = "aa")
    public void afterReturningMethod(JoinPoint joinPoint, Object aa){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果："+aa);
    }
    // 后置
    @After(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void afterMenthond(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知,方法名称："+name);
    }

//    // 异常
//    @AfterThrowing

//    //环绕
//    @Around()

}
