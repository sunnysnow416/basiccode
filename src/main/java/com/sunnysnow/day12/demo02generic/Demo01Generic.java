package com.sunnysnow.day12.demo02generic;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型概念：
        是一种未知的数据类型，当我们不知道使用数据类型的时候，可以使用泛型。
    泛型也可以看成是一个变量，用来接收数据类型。
        E e: Element元素
        T t: Type 类型
    ArrayList在集合定义的时候不知道集合中都会存在什么类型，所以类型使用泛型。
    E未知的数据类型
    比如：
        public class ArrayList<E>{
            public boolean add(E e){}
            public E get(int index){}
       }

    创建集合对象的时候，会确定泛型的数据类型。
    ArrayList<String> list = new ArrayList<String>();

    使用泛型的好处
 */
public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    /*
        创建集合对象，使用泛型
        好处：
            1、避免了类型转化的麻烦，存储的什么类型，取出的就是什么类型
            2、把运行期异常，提升到了编译期
        弊端：可忽略
            泛型是类型，只能存储什么类型的数据

     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        //list.add(1); //不能存储int类型的数据，直接编译报错
        for (String s : list) {
            System.out.println(s);
            System.out.println(s.length());
        }
    }

    /*
        创建集合对象，不使用泛型
        好处：
            集合不使用泛型，默认的数据类型就是Object，可以存储任意类型的数据
        弊端：
            集合不安全，会引发异常。
     */
    private static void show01() {

        ArrayList list = new ArrayList();
        list.add("你好");
        list.add(1);
        Iterator it = list.iterator();
        while (it.hasNext()){
            //返回值默认是Object类型
            Object o = it.next();
            System.out.println(o);//此处打印没有问题

            //想使用String类特有的方法length()方法获取字符串的长度.不能使用，多态Object ojb ="abc";
            //需要向下转型
            //会抛出ClassCastException异常，不能吧integer类型转化为String类型
            String s =(String)o;
            System.out.println(s.length());  //ClassCastException异常
        }
    }
}
