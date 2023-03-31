package com.atguigu.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 15:50
 */

    @Test
    public void testValidationOne() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        return;

    }

}
