package com.sunnysnow.day12.list;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List
    LinkedList集合的特点：
        1、底层是一个链表结构，查询慢，增删快
        2、里边包含了大量操作头尾元素的方法
    注意事项：使用LinkedList集合特有方法，不能使用多态；
        public void addFirst(E e) 在该列表开头插入指定的元素。
        public void addLast(E e) 将指定的元素追加到此列表的末尾。
        public void push(E e) 将元素推送到由此列表表示的堆栈上。

        public E getFirst() 返回此列表中的第一个元素。
        public E getLast() 返回此列表中的最后一个元素。

        public E removeFirst()从此列表中删除并返回第一个元素。
        public E removeLast()从此列表中删除并返回最后一个元素。
        public E pop() 从此列表表示的堆栈中弹出一个元素。

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();
    }

    /*
        public E removeFirst()从此列表中删除并返回第一个元素。
        public E removeLast()从此列表中删除并返回最后一个元素。
        public E pop() 从此列表表示的堆栈中弹出一个元素。 相当于removeFirst
     */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法向集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); //[a,b,c]

        //public E removeFirst()从此列表中删除并返回第一个元素。
        //String first = linked.removeFirst();
        String first = linked.pop();
        System.out.println("被移除的第一个元素："+first); //a

        //public E removeLast()从此列表中删除并返回最后一个元素。
        String last = linked.removeLast();
        System.out.println("被移除的最后一个元素："+last);//c

        System.out.println(linked); //[b]
    }

    /*
        public E getFirst() 返回此列表中的第一个元素。
        public E getLast() 返回此列表中的最后一个元素。
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法向集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); //[a,b,c]

        //linked.clear();//清空集合中的元素，再获取集合中元素会抛出NoSuchElementException
        if(!linked.isEmpty()) {
            //public E getFirst() 返回此列表中的第一个元素。
            String first = linked.getFirst();
            System.out.println(first); //a

            // public E getLast() 返回此列表中的最后一个元素。
            String last = linked.getLast();
            System.out.println(last);//c
        }



    }

    /*
        public void addFirst(E e) 在该列表开头插入指定的元素。
        public void addLast(E e) 将指定的元素追加到此列表的末尾。
        public void push(E e) 将元素推送到由此列表表示的堆栈上。相当于addFirst
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法向集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); //[a,b,c]

        //public void addFirst(E e) 在该列表开头插入指定的元素。
        linked.addFirst("www");
        System.out.println(linked);//[www, a, b, c]
        linked.push("baidu");  //与addFirst方法等效
        System.out.println(linked);//[baidu, www, a, b, c]

        linked.addLast("com"); //等效于add，都写到最末尾
        System.out.println(linked);//[baidu, www, a, b, c, com]
    }
}
