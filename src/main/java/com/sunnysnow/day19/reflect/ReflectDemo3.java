package com.sunnysnow.day19.reflect;

import com.sunnysnow.day19.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

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
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //0.获取person的class对象
        Class personClass = Person.class;

        /*
        获取构造方法们
            Constructor<?>[] getConstructors()
            Constructor<T> getConstructor(类<?>... parameterTypes)

            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         */

        //1. Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("zhangan", 23);
        System.out.println(person);
        System.out.println("====================");

        //2.Constructor<?>[] getConstructors()
        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
        //创建对象
        Object person2 = constructor2.newInstance();
        System.out.println(person2);  //Person{name='null', age=0, a='null', b='null', c='null', d='null'}

        // 空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
        Object person3 = personClass.newInstance();
        System.out.println(person3);  //Person{name='null', age=0, a='null', b='null', c='null', d='null'}


        //constructor2.setAccessible(true);  //暴力反射
    }
}
