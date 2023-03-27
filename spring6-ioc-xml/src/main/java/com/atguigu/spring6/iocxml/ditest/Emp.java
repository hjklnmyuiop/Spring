package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 15:54
 */
//员工类
public class Emp {
    private String ename;
    private Integer age;
    //对象类型的属性
    private Dept dept;
    private String[] loves;
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work(){
        System.out.println(ename+"emp work....."+age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }
}
