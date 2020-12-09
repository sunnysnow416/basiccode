package com.sunnysnow.day19.reflect;

import com.sunnysnow.day19.domain.Person;

import java.lang.reflect.Field;

/*
    使用Class对象：
       1、获取成员变量们
            Field[] getFields():获取所有public修饰的成员变量
            Field getField(String name)

            Field[] getDeclaredFields()
            Field getDeclaredField(String name)

       2、获取构造方法们
            Constructor<?>[] getConstructors()
            Constructor<T> getConstructor(类<?>... parameterTypes)

            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)

       3、获取成员方法们
            Method[] getMethods()
            Method getMethod(String name, 类<?>... parameterTypes)

            Method[] getDeclaredMethods()
            Method getDeclaredMethod(String name, 类<?>... parameterTypes)

       4、获取类名
            String getName()
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //0.获取person的class对象
        Class personClass = Person.class;

        /*
        1、获取成员变量们
            Field[] getFields():获取所有public修饰的成员变量
            Field getField(String name)

            Field[] getDeclaredFields()
            Field getDeclaredField(String name)
         */
        //1.Field[] getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=======================");

        //2.Field getField(String name)
        Field a = personClass.getField("a");
        System.out.println(a);
        //获取成员变量a的值
        Person p1 =new Person();
        Object o = a.get(p1);
        System.out.println(o); //null
        //设置a的值
        a.set(p1,"zhangsan");
        System.out.println(p1);  //Person{name='null', age=0, a='zhangsan', b='null', c='null', d='null'}
        System.out.println("=======================");



        //3. Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //4.Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true); //暴利反射
        Object value2 = d.get(p1);
        System.out.println(value2);

        /*
        Field:成员变量
        操作：
            1.设置值
                void set(Object obj, Object value)
            2.获取值
                Object get(Object obj)
            3.忽略访问权限修饰符的安全检查
                setAccessible(true); //暴利反射
         */
    }
}
