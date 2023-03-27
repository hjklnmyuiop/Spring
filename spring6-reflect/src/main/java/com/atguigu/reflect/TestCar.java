package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: dev_guo
 * @Date: 2023/3/24 17:09
 */
public class TestCar {
    //1、获取class对象的多种方式
    @Test
    public void test01() throws Exception {
        //1、类目.class
        Class<Car> clazz1 = Car.class;
        //2、//对象.getClass()
        Class clazz2 = new Car().getClass();
        //3、//Class.forName()
        Class clazz3 = Class.forName("com.atguigu.reflect.Car");
        //实例化
        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }
    //2、获取构造方法
    @Test
    public void test02() throws Exception{
        Class clazz = Car.class;
        //获取所有public构造方法
        Constructor[] constructors = clazz.getConstructors();
        //可以获取私有的方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        for (Constructor constructor : constructors) {
            System.out.println("方法名称"+constructor.getName()+"参数个数"+constructor.getParameterCount());
        }
        //指定有参数构造创建对象
        //public构造
//        Constructor constructor = clazz.getConstructor(String.class, int.class, String.class);
//        Car car1 = (Car) constructor.newInstance("夏利",3,"红色");
//        System.out.println(car1);
        //构造private
        Constructor c2 = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        c2.setAccessible(true);
        Car car2 = (Car) c2.newInstance("夏利",3,"红色");
        System.out.println(car2);

    }
    //3、获取属性
    @Test
    public void test03() throws Exception{
        Class clazz =   Car.class;
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
//        Field[] fields = clazz.getFields();
        //获取所有属性(包含私有的)
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field.getName());
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(car,"五菱宏光");
            }
        }
        System.out.println(car);
    }
    //4、获取方法
    @Test
    public void test04() throws Exception{
        Car car = new Car("奔驰", 10, "黑色");
        Class clazz = car.getClass();
        //1 public方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
//            System.out.println(method.getName());
            if (method.getName().equals("toString")){
                String invoke = (String) method.invoke(car);
                System.out.println("toString执行了"+invoke);
            }
        }
        //2 private 方法
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method method : methods1) {
            //执行方法 toString
            if (method.getName().equals("run")){
                method.setAccessible(true);
                method.invoke(car);
            }
        }
    }
}
