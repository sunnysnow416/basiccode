package com.sunnysnow.day17.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream  字节输入流
    这个抽象类是表示输入字节流的所有类的超类。

    定义了一些子类共性的成员方法：
        abstract int read() ：从输入流读取数据的下一个字节。
        int read(byte[] b) ：从输入流读取一些字节数，并将它们存储到缓冲区 b 。
        void close() ：关闭此输入流并释放与流相关联的任何系统资源。

    java.io.FileInputStream extend InputStream
    FileInputStream 文件字节输入流
    作用:把硬盘文件中的数据读取到内存中

    构造方法：
        FileInputStream(File file) ：通过打开与实际文件的连接创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
        FileInputStream(String name) ：通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
        参数：读取文件的数据源
            File file：文件
            String name：文件路劲
        作用：
            1、创建一个FileInputStream对象
            2、会把FileInputStream对象指向构造方法中要读取的文件
    读取数据原理：
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
    字符输入流的使用步骤（重点）：
        1、创建FileInputStream对象，构造方法中绑定要读取的数据源
        2、使用FileInputStream对象中的方法read读取文件
        3、流使用完要释放资源
 */
public class demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1、创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\a.txt");
        // 2、使用FileInputStream对象中的方法read读取文件
        //int read() 读取文件中的一个字节并返回，读到文件的末尾返回-1
        //不止要有几个字节，不确定循环次数用while循环，确定次数用for循环.
        //read方法读完后会将指针移动到下一个字节，所以要将获取到的当前指针赋值给变量len
        int len=0;
        while ((len = fis.read())!=-1){
            System.out.println((char) len);
        }
        // 3、流使用完要释放资源
        fis.close();
    }
}
