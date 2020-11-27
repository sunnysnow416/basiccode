package com.sunnysnow.day14.demo05.Thread;

/**
 * 主线程：执行主方法（mian）的程序
 * 单线程程序：java程序中只有一个线程
 * 程序从main方法开始从上到下依次执行
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        //结果从上到下依次执行，单线程程序
        Person p1 = new Person("张三");
        p1.run();

        Person p2 = new Person("旺财");
        p2.run();
    }
}
