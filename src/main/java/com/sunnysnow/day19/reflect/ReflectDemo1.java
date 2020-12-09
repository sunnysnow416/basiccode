package com.sunnysnow.day19.reflect;

import com.sunnysnow.day19.domain.Person;

/**
 * 获取Class对象方式：
 *         1.Class.forName("全类名")：将字节码文件加载进内场，返回Class对象
 *         2.类名.class：通过类名的属性class获取
 *         3.对象.getClass:getClass()方法再object类中定义着。
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class  cls1 = Class.forName("com.sunnysnow.day19.domain.Person");
        System.out.println(cls1);
        System.out.println("========================");

        // 2.类名.class：
        Class cls2 = Person.class;
        System.out.println(cls2);
        System.out.println("========================");

        //3.对象.getClass:getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //用==判断对象是不是一个
        System.out.println(cls1==cls2); //true
        System.out.println(cls2==cls3); //true
    }
}
