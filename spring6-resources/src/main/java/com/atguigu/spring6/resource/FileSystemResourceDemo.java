package com.atguigu.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: dev_guo
 * @Date: 2023/3/29 18:01
 */
//访问系统资源
public class FileSystemResourceDemo {
    public static void main(String[] args) {
        //
//        loadAndReadUrlResource("D:\\java\\spring6\\spring6-resources\\target\\classes\\atguigu.txt");
        loadAndReadUrlResource("atguigu.txt");
    }
    public static void loadAndReadUrlResource(String path){
        //创建对象
        FileSystemResource resource = new FileSystemResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        try {
            InputStream inputStream = resource.getInputStream();
            byte[] b = new byte[1024];
            while (inputStream.read(b)!=-1){
                System.out.println(new String(b));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
