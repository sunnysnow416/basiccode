package com.sunnysnow.day12.set;

import java.util.HashSet;

/*
    HashSet存储自定义类型的元素
    Set集合保证元素唯一：
        存储的元素的（String ，Integer，...Person）,必须重写hashCode方法和equals方法

    要求：
        同名同年龄的人视为同一个人，只能存储一次。
 */
public class Demo06HashSetSavingPerson {
    public static void main(String[] args) {
        //创建hashset集合存储Person
        HashSet<Person2> set = new HashSet<>();
        Person2 p1 = new Person2("小美女",18);
        Person2 p2 = new Person2("小美女",18);
        Person2 p3 = new Person2("小美女",19);
        System.out.println(p1.hashCode()); //1020371697  //Person2中重写hashCode和equals方法后，734175839
        System.out.println(p2.hashCode()); //789451787  //Person2中重写hashCode和equals方法后，734175839
        System.out.println(p1.equals(p2)); //false  //Person2中重写hashCode和equals方法后，true
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//[Person2{name='小美女', age=19}, Person2{name='小美女', age=18}, Person2{name='小美女', age=18}]
        //Person2中重写hashCode和equals方法后，[Person2{name='小美女', age=19}, Person2{name='小美女', age=18}]
    }
}
