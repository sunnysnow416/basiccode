package com.sunnysnow.day12.demo02generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl对象
        GenericInterfaceImpl g1= new GenericInterfaceImpl();
        g1.method("hello");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> g2 =new GenericInterfaceImpl2();
        g2.method(33);

        GenericInterfaceImpl2<String> g3 =new GenericInterfaceImpl2();
        g3.method("hello");
    }
}
