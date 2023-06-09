package com.atguigu.spring6.validator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 15:41
 */
@Configuration
@ComponentScan("com.atguigu.spring6.validator")
public class ValidationConfig {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
