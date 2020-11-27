package com.sunnysnow.day18.demo04.objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    java.io.ObjectInputStream extends InputStream
        ObjectInputStream：对象的反序列化流
        作用：把文件中保存的对象，以流的方式读取出来使用
    构造方法：
        ObjectInputStream(InputStream in) 创建从指定的InputStream读取的ObjectInputStream。
    参数：
        InputStream in：字节输入流
    特有的成员方法：
        readObject() 从ObjectInputStream读取一个对象。

     使用步骤：
        1、创建ObjectInputStream对象，构造方法中传入字节输入流
        2、使用ObjectInputStream对象方法readObject,读取文件
        3、释放资源
        4、使用读取出来的对象（打印）
     readObject 方法声明抛出了ClassNotFoundException（class文件找不到异常）
     当不存在对象的class文件时被抛出此异常
     反序列化的前提：
        1、类必须实现Serializable接口
        2、必须存在类对应的class文件
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\person.txt"));
        Object object = ois.readObject();
        ois.close();
        System.out.println(object);
        Person p = (Person)object;
        System.out.println(p);
    }
}
