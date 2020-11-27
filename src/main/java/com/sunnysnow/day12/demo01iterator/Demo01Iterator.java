package com.sunnysnow.day12.demo01iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator 接口：迭代器（对集合进行遍历）
    有两个常用方法：
    boolean hasNext() 如果迭代具有更多元素，则返回 true 。
        判断集合中有没有下一个元素，有就返回true，没有返回false
    E next() 返回迭代中的下一个元素。
    Iterator迭代器，是一个接口，无法直接使用，需要使用Iterator接口的实现类对象。获取实现类对象的方法比较特殊：
    Collection接口中有一个方法Iterator()，这个方法返回的就是迭代器的实现类对象。
        Iterator<E> iterator() 返回此集合中的元素的迭代器。
    使用步骤：
    1、使用集合红的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2、使用 Iterator接口中的方法hasNext()判断有没有下一个元素
    3、使用Iterator接口中的方法next()取出集合中的下一个元素

 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚敏");
        coll.add("科比");
        coll.add("艾弗森");
        coll.add("詹姆斯");
        /*
         1、使用集合红的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
         注意事项：
            Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------");

        //也可使用for循环遍历，了解即可，用的不多
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String s = it2.next();
            System.out.println(s);
        }
    }
}
