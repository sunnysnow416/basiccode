package com.sunnysnow.day18.demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter  extends  Writer
    BufferedWriter :字符缓冲输出流

    继承自父类的共性成员方法：
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。
    构造方法：
        BufferedWriter(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
        BufferedWriter(Writer out, int sz) 创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
    参数：
        Writer out：字符输出流
            我们可以传递FileWriter,缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率。
        int sz ：指定缓冲流内部的缓冲区大小，不指定使用默认。

    特有的成员方法：
        void newLine() 写一行行分隔符 。会根据不同的操作系统，获取不同的行分隔符
    使用步骤：
        1、创建一个字符缓冲输出流对象，构造方法传递字符输出流
        2、调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        3、调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        4、释放资源
 */
public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1、创建一个字符缓冲输出流对象，构造方法传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\buffer03.txt"));
        //2、调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        for(int i=0;i<10;i++){
            bw.write("保守估计重新上市的时");
            bw.newLine();  //换行
        }

        //3、调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        bw.flush();
        //4、释放资源
        bw.close();
    }
}
