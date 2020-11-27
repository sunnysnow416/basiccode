package com.sunnysnow.day12.demo02generic;
/*
    GenericInterface接口的实现类
    含有泛型的接口的第一种实现方式：定义接口的实现类，实现接口，指定接口的泛型
        public interface Iterator<E>{
            E next();
        }
        Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next方法泛型默认就是字符串
        public final class Scanner implements Iterator<String>{
            public String next(){}
        }
 */
public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
