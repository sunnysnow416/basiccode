package com.sunnysnow.day12.demo02generic;

import java.util.ArrayList;
import java.util.Collection;

/*
    泛型的高级使用；要求只要看源码能看懂即可，用的不多
        泛型的上限限定：? extends E   代表使用的泛型只能是E类型的子类或者本身
        泛型的下限限定：? super E     代表使用的泛型只能是E类型的父类或者本身
 */
public class Demo06Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement1(list1);
        //etElement1(list2); //报错
        getElement1(list3);
        //getElement1(list4);//报错

        //getElement2(list1);//报错
        //getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
        /*
            类与类之间是有继承关系的：
                Integer extends Number extends Object
                String extends Object

         */
    }

    //泛型的上限，此时的泛型?必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){};
    //泛型的下限，此时的泛型?必须是Number类型或者Number类型的子类
    public static void getElement2(Collection<? super Number> coll){};
}
