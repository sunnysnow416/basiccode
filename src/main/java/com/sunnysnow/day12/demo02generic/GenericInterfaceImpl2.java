package com.sunnysnow.day12.demo02generic;

/*
    含有泛型的接口的第二种实现方式：接口使用什么泛型，实现类就使用什么泛型。类跟着接口走
    相当于定了一个含有泛型的类，创建对象的时候确定什么类型
        public interface List<E>{
            boolean add(E e);
            E get(int index);
        }
        public class ArrayList<E> implements List<E>{
            void add(int index, E element)
            E get(int index)
        }
 */
public class GenericInterfaceImpl2<T> implements GenericInterface<T> {
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
