package com.sunnysnow.day17.demo01.OutPutStream;

import jdk.internal.dynalink.beans.StaticClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/*
    java.io.OutputStream :字节输出流
        此抽象类是表示输出字节流的所有类的超类
    定义了一些子类共性的成员方法：
        void close():关闭此输出流并释放与此流相关联的任何系统资源。
        void flush():刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b):将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len):从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b):将指定的字节写入此输出流。

     java.io.FileOutputStream  extends OutputStream
     FileOutputStream:文件字节输出流
     作用：把内存中的数据写入到硬盘的文件中

     构造方法：
        FileOutputStream(String name) 创建文件输出流以指定的名称写入文件。
        FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件。
     参数：写入数据的目的
            String name:目的地是一个文件的路劲
            File file:目的地是一个文件
     构造方法的作用：
        1、创建一个FileOutputStream对象
        2、会根据构造方法中传递的参数的文件/文件路劲，创建一个空文件
        3、会把FileOutputStream对象指向创建好的文件

     写入数据的原理：
     java程序-->JVM(java虚拟机)-->OS（操作系统）-->OS调用写数据的方法-->吧数据写入文件中

     字节输出流的使用步骤（重点）：
     1、创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
     2、调用FileOutputStream对象中的方法write，把数据写入文件中
     3、释放资源（流使用会占用一定的内存，使用完毕要把流清空，提高程序的效率）

 */
public class Demo01OutPutStream {

    public static void main(String[] args) throws IOException {

        Demo01OutPutStream d01= new Demo01OutPutStream();
        String filePath = d01.getFilePath();

        //1、创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        //FileOutputStream fos = new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\target\\classes\\17files\\a.txt");
        FileOutputStream fos = new FileOutputStream(filePath);
        // 2、调用FileOutputStream对象中的方法write，把数据写入文件中
        //一次写一个字节
        fos.write(100);
        //3、释放资源
        fos.close();
    }

    //类加载器获取路劲
    private  String getFilePath() {
        String path = this.getClass().getClassLoader().getResource("17files/a.txt").getPath();
        return path;
    }
}
