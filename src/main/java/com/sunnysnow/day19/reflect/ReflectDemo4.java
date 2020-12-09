package com.sunnysnow.day19.reflect;

import com.sunnysnow.day19.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
    使用Class对象：
       1、获取成员变量们
            Field[] getFields():获取所有public修饰的成员变量
            Field getField(String name)

            Field[] getDeclaredFields()
            Field getDeclaredField(String name)

       2、获取构造方法们
            Constructor<?>[] getConstructors()
            Constructor<T> getConstructor(类<?>... parameterTypes)

            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)

       3、获取成员方法们
            Method[] getMethods()
            Method getMethod(String name, 类<?>... parameterTypes)

            Method[] getDeclaredMethods()
            Method getDeclaredMethod(String name, 类<?>... parameterTypes)

       4、获取类名
            String getName()
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //0.获取person的class对象
        Class personClass = Person.class;

        /*
        3、获取成员方法们
            Method[] getMethods()
            Method getMethod(String name, 类<?>... parameterTypes)

            Method[] getDeclaredMethods()
            Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */

        //1.Method getMethod(String name, 类<?>... parameterTypes)获取指定名称的方法
        Method eat_Method = personClass.getMethod("eat");
        Person person = new Person();
        eat_Method.invoke(person);  //est...

        Method eat_Method2 = personClass.getMethod("eat",String.class);
        eat_Method2.invoke(person,"饭");

        System.out.println("========================");

        //获取所有piblic修饰的所有方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);   //还会另外显示Object类中的方法
            //获取方法名
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);  //暴力反射
        }

        //获取类名
        String name = personClass.getName();
        System.out.println(name);  //com.sunnysnow.day19.domain.Person
    }
}
