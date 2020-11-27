package com.sunnysnow.day18.demo03.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    转换流：输出流

    java.io.OutputStreamWriter  extends Writer
    OutputStreamWriter:是字符的桥梁流以字节流：向其写入的字符编码成使用指定的字节charset 。
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。 (编码)

    共性的成员方法有：
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。
    构造方法：
        OutputStreamWriter(OutputStream out)创建一个使用默认字符编码的OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。

        参数：
            OutputStream out 字节输出流，可以用来写转换之后的字节到文件中
            String charsetName 编码表名称，不区分大小写，可以是utf-8 UTF-8 GBK gbk，不指定，默认是utf-8

   使用步骤：
        1、创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2、使用OutputStreamWriter对象中的方法write，把字符转化为字节存储到缓冲区中（编码）
        3、使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节）
        4、释放资源


 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //Write_utf8();
        Write_GBK();
       }

    private static void Write_GBK() throws IOException {
        //1、创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\GBK.txt"),"GBK");
        //2、使用OutputStreamWriter对象中的方法write，把字符转化为字节存储到缓冲区中（编码）
        osw.write("我写的是GBK");
        //3、使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节）
        osw.flush();
        // 4、释放资源
        osw.close();
    }

    private static void Write_utf8() throws IOException {
        //1、创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
//        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\10_IO\\files\\utf-8.txt")); //默认是utf-8
        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\10_IO\\files\\utf-8.txt"),"utf-8");
        //2、使用OutputStreamWriter对象中的方法write，把字符转化为字节存储到缓冲区中（编码）
        osw.write("我写的是utf-8");
        //3、使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节）
        osw.flush();
        // 4、释放资源
        osw.close();
    }
}
