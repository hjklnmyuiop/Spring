package com.atguigu.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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

    // 后置
    @After(value = "pointcut()")
    public void afterMenthond(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知,方法名称："+name);
    }
    // 返回
    @AfterReturning(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))", returning = "aa")
    public void afterReturningMethod(JoinPoint joinPoint, Object aa){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果："+aa);
    }
//    // 异常
//    @AfterThrowing
    @AfterThrowing(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))",throwing = "exe")
    public void afterThrowing(JoinPoint joinPoint,Throwable exe){
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知,方法名称："+name+",异常信息"+exe.getMessage());
    }
//    //环绕
//    @Around()
    @Around("execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public  Object  aroundMenthod(ProceedingJoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("环绕通知==目标方法之前执行：");
            result = joinPoint.proceed();
            System.out.println("环绕通知==目标方法返回值之后：");
        }catch (Throwable throwable){
            System.out.println("环绕通知==目标方法出现异常执行");
        }finally {
            System.out.println("环绕通知==目标方法执行完毕");
        }
        return result;
    }
    //重用切入点表达式
    @Pointcut(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut(){

    }
}
