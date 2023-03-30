package com.atguigu.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: dev_guo
 * @Date: 2023/3/29 17:52
 */
public class ClassPathResourceDemo {
    public static void main(String[] args) {
        loadAndReadUrlResource("atguigu.txt");
    }
    public static void loadAndReadUrlResource(String path) {
        ClassPathResource resource = new ClassPathResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        try {
            InputStream inputStream = resource.getInputStream();
            byte[] b = new byte[1024];
            while (inputStream.read(b) !=-1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
