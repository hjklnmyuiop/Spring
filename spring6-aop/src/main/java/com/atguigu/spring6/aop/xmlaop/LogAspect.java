package com.atguigu.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: dev_guo
 * @Date: 2023/3/28 11:10
 */
@Component //ioc容器
public class LogAspect {
    // 前置
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知,方法名称："+name+",参数："+args);
    }

    // 后置通知
    public void afterMenthond(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知,方法名称："+name);
    }
    // 返回通知
    public void afterReturningMethod(JoinPoint joinPoint, Object aa){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果："+aa);
    }
    // 异常通知
    public void afterThrowing(JoinPoint joinPoint,Throwable exe){
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知,方法名称："+name+",异常信息"+exe.getMessage());
    }
    //环绕通知
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
}
