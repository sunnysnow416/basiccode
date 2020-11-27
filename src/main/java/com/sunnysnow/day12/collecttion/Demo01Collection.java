package com.sunnysnow.day12.collecttion;

import java.util.ArrayList;
import java.util.Collection;

/*
    java.util.Collection
        所有单列集合最顶层的接口，定义了所有单列集合共性的方法。
        任意的单列集合都可以使用Collection中的方法
    共性的方法有：
        public boolean add(E e) 确保此集合包含指定的元素（可选操作）。
        public void clear() 从此集合中删除所有元素（可选操作）。
        public boolean remove(Object o) 从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
        public boolean contains(Object o) 如果此集合包含指定的元素，则返回 true 。
        public boolean isEmpty() 如果此集合不包含元素，则返回 true 。
        public int size() 返回此集合中的元素数。
        public Object[] toArray() 返回一个包含此集合中所有元素的数组。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，使用多态
        Collection coll = new ArrayList();
        System.out.println(coll);  //[],重写了toString方法

        /*
        public boolean add(E e) 确保此集合包含指定的元素（可选操作）。
        返回值是一个boolean值，一般都返回true，可以不用接受
         */
        boolean b1 = coll.add("张三");
        System.out.println(b1); //true
        System.out.println(coll); //[张三]

        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll); //[张三, 李四, 王五, 赵六, 田七]

        /*
        public boolean remove(Object o) 从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
        返回值是boolean值，集合中存在会删除元素，返回true
        集合中不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("赵六");
        System.out.println(b2); //true
        boolean b3 = coll.remove("赵六");
        System.out.println(b3); //false
        System.out.println(coll); //[张三, 李四, 王五, 田七]

        /*
        public boolean contains(Object o) 如果此集合包含指定的元素，则返回 true 。

         */
        boolean b4 = coll.contains("李四");
        System.out.println(b4); //true
        boolean b5 = coll.contains("李ll");
        System.out.println(b5);//false

        /*
        public boolean isEmpty() 如果此集合不包含元素，则返回 true
        集合为空返回true
        集合不为空返回false。
         */
        boolean b6 = coll.isEmpty();  //[张三, 李四, 王五, 田七]
        System.out.println(b6);//false

        /*
        public int size() 返回此集合中的元素数。
         */
        int size = coll.size();
        System.out.println(size); //4

        /*
        public Object[] toArray() 返回一个包含此集合中所有元素的数组。
         */
        Object[] arr = coll.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        /*
        public void clear() 从此集合中删除所有元素（可选操作）。
        不是删除集合，集合还在
         */
        coll.clear();
        System.out.println(coll);//[]
        coll.isEmpty();//true
    }
}
