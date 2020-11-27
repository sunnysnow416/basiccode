package com.sunnysnow.day17.demo06.TryCatch;

import java.io.FileNotFoundException;

/*
    JDK9新特性(了解即可)
    try前边可以定义流对象
    try后边的()中可以直接引入流对象的名称（变量名）
    在try的代码执行完毕之后，流对象也可以释放掉，不用写finally
    格式：
        A a = new A();
        B b =new B();
        try(a,b){
            可能会产生异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */
public class Demo03JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        /*

        //1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\1.jpeg");
        // 2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("c:\\\\tmp\\\\1.jpeg");
        //jdk9的新特性，本地jdk是8，所以会报错不可使用
        try(fis:fos){
            //方法二：一次读取多个字节。效率更高。
            // 大概25k的文件大概需要5毫秒；单字节复制大概需要768毫秒
            int len =0;
            byte[] bytes =new byte[1024];
            while ((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
        */
    }
}
