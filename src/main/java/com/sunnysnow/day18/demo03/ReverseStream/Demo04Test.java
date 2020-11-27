package com.sunnysnow.day18.demo03.ReverseStream;

import java.io.*;

/*
    练习：转换文件编码
        将GBK编码的文本文件，转为UTF-8编码的文本文件
    分析：
        1、创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2、创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        3、使用InputStreamReader对象的方法read，读取文件
        4、使用OutputStreamWriter对象的方法write，把读取的数据写入文件中
        5、释放资源

 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        // 1、创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\我是gbk格式的文本.txt"),"gbk");
        //2、创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osr =new OutputStreamWriter(new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\我是utf8的文本.txt"),"utf-8");
        //3、使用InputStreamReader对象的方法read，读取文件
        int len=0;
        while ((len=isr.read())!=-1){
            // 4、使用OutputStreamWriter对象的方法write，把读取的数据写入文件中
            osr.write(len);
        }
        // 5、释放资源
        osr.close();
        isr.close();
    }
}
