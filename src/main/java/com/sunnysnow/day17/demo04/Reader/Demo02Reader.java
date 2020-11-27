package com.sunnysnow.day17.demo04.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader :字符输入流，是字符输入流最顶层的父类，定义了一些共性的成员方法，是抽象类
    共性的成员方法：
        int read() ：读一个字符并返回
        int read(char[] cbuf) ：一次读取多个字符，将字符读入数组。
        abstract void close() ：关闭流并释放与之相关联的任何系统资源。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader 文件字符输入流
    作用：把硬盘中的数据以字符的方式读取到内存中

    构造方法：
        FileReader(File file) 创建一个新的 FileReader ，给出 File读取。
        FileReader(String fileName) 创建一个新的 FileReader ，给定要读取的文件的名称。
    参数：读取文件的数据源
        String fileName 文件路劲
        File file 一个文件
    构造方法的作用：
        1、创建一个FileReader对象
        2、会把FileReader对象指向要读取的文件

    字符输入流使用步骤（重点）：
        1、创建FileReader对象，构造方法中绑定要读取的数据源
        2、使用FileReader对象中的方法read读取文件
        3、释放资源

 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        // 1、创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\c.txt");
        //方法一：读取单个字符并返回
        /*
        int len=0;
        while ((len = fr.read())!=-1){
            System.out.print((char)len); //你好abc122!@#
        }
         */
        //方法二：读取多个字符
        int len =0; //记录的是每次读取的有效字符个数
        char[] chars = new char[1024]; //数组用于读取到的多个字符
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));//把字符数组的一部分转化为字符串
        }
        //3、释放资源
        fr.close();
    }
}
