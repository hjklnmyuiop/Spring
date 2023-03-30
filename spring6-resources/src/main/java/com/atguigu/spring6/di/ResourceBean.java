package com.atguigu.spring6.di;


import org.springframework.core.io.Resource;

/**
 * @Author: dev_guo
 * @Date: 2023/3/30 9:49
 */
public class ResourceBean {
    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }
    public Resource getResource() {
        return resource;
    }
    public void parse(){
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
