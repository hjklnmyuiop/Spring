package com.atguigu.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;


/**
 * @Author: dev_guo
 * @Date: 2023/3/29 17:39
 */
//演示urlResource访问网络资源
public class UrlResourceDemo {
    public static void main(String[] args) {
        loadUrlResource("HTTP://www.baidu.com");
        loadUrlResource("file:atguigu.txt");
    }
    //访问http\file资源
    public static void loadUrlResource(String path){
        //创建Resource实现类的对象 UrlResource
        try {
            UrlResource url = new UrlResource(path);
            //获取资源信息
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
