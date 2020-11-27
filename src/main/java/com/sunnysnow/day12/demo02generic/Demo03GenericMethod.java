package com.sunnysnow.day12.demo02generic;
/*
    测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        //调用含有泛型的方法method01，传递什么类型，泛型就是什么类型
        gm.method01("hello");
        gm.method01(1);
        gm.method01(1.0);
        gm.method01(true);

        //调用含有泛型的静态方法
        //通过类名直接访问
        GenericMethod.method02("nihao");
        GenericMethod.method02(1);
        GenericMethod.method02(1.0);
        GenericMethod.method02(true);
    }
}
