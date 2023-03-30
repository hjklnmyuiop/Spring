package com.atguigu.spring6.validator.two;

import com.atguigu.spring6.validator.two.MyValidation1;
import com.atguigu.spring6.validator.two.User;
import com.atguigu.spring6.validator.two.ValidationConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 15:50
 */

public class TestUser {
    @Test
    public void validatorByUserOne(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 myService = context.getBean(MyValidation1.class);
        User user = new User();
        user.setAge(-1);
        boolean validator = myService.validator(user);
        System.out.println(validator);
    }

}
