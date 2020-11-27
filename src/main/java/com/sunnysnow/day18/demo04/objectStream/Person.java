package com.sunnysnow.day18.demo04.objectStream;

import java.io.Serializable;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常。

    Serializable接口也叫标记型接口：
        要进行序列化和反序列化的类必须实现接口，就会给类加一个标记。
        当我们进行序列化和反序列化的时候就会检测类上是否有这个标记，如果有就可以序列化和反序列化
        如果没有就会抛出NotSerializableException异常

     static关键字：静态关键字
        静态优先于非静态加载到内存中（静态优先于非静态进入到内存中）
        被static修饰的成员变量不能被序列化的，序列化的都是对象
    transient关键字：瞬态关键字
 */
public class Person implements Serializable {
    private static  final  long serialVersionUID =1; //不管类的定义序列化后是否被修改，反序列化都会成功
    private String name;
    public int age;
    //private static int age;    //反序列化的age是0，不能被序列化
    //private transient int age;   //如果成员变量不想被序列化，可以使用此关键字

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
