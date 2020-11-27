package com.sunnysnow.day18.demo02.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习：一读一些
    明确：
        数据源：c:\\1.jpeg
        数据的目的地：c:\\tmp\\1.jpeg
    文件复制的步骤：
     1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
     2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
     3、使用字节输入流对象中的read方法读取文件
     4、使用字节输出流中的方法write，把读取到的字节吸入到目的地文件中
     5、释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\1.jpeg");
        // 2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("c:\\\\tmp\\\\1.jpeg");
        //方法一：一次读取一个字节
        /*
        int len =0;
        while ((len = fis.read())!=-1){
            fos.write(len);
        }
         */
        //方法二：一次读取多个字节。效率更高。
        // 大概25k的文件大概需要66毫秒；单字节复制大概需要768毫秒
        int len =0;
        byte[] bytes =new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //释放资源。先关闭写的，再关闭读的，如果写完了，肯定是读完了。
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
