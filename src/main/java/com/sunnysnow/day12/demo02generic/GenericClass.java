package com.sunnysnow.day12.demo02generic;
/*
    定义一个含有泛型的类，模拟ArrayList集合
    泛型是一个未知的数据类型，当我们不确定用什么数据类型的时候，可以用泛型
    泛型可以接收任意的数据类型：integer、String、Student...
    创建对象的时候确定数据类型
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
