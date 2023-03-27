package com.atguigu.reflect;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 17:06
 */
public class Car {
    //属性已经get
    private String name;
    private int age;
    private String color;

    public Car() {
    }
    //有参构造
    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    private void run(){
        System.out.println("私有方法-run......");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
