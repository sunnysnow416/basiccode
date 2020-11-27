package com.sunnysnow.day18.demo04.objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream：对象的序列化流
    作用：将对象以流的方式写入到文件中

    构造方法：
        ObjectOutputStream(OutputStream out) 创建一个写入指定的OutputStream的ObjectOutputStream。
        参数：
            OutputStream out：字节输出流
    特有的成员方法：
        void writeObject(Object obj) ：将指定的对象写入ObjectOutputStream。
    使用步骤：
        1、创建ObjectOutputStream对象，构造方法中传入字节输出流
        2、使用ObjectOutputStream对象方法writeObject,把对象写到文件中
        3、释放资源
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\person.txt"));
        oos.writeObject(new Person("张三",19));
        oos.close();
    }
}
