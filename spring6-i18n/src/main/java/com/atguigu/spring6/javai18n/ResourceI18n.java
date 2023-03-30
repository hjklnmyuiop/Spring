package com.atguigu.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 11:02
 */
public class ResourceI18n {
    public static void main(String[] args) {
        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("en","GB")).getString("test"));

        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("zh","CN")).getString("test"));
    }
}
