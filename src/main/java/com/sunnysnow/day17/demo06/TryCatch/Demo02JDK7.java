package com.sunnysnow.day17.demo06.TryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7的新特性(了解即可)
    在try的后边可以增加一个()，再括号中定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，把流对象释放，不用写finally
    格式：
        try(定义流对象;定义流对象...){
            可能会产生异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try (//1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
             FileInputStream fis = new FileInputStream("C:\\1.jpeg");
             // 2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
             FileOutputStream fos = new FileOutputStream("c:\\tmp\\1.jpeg");) {
            //方法二：一次读取多个字节。效率更高。
            // 大概25k的文件大概需要5毫秒；单字节复制大概需要768毫秒
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
