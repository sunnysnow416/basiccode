package com.sunnysnow.day18.demo02.CopyFile;

import java.io.*;

/*
    文件复制练习：一读一些
    明确：
        数据源：c:\\1.jpeg
        数据的目的地：c:\\tmp\\1.jpeg
    文件复制的步骤：
     1、创建一个字节缓冲输入流对象，构造方法中传入字节输入流
     2、创建一个字节缓冲输出流对象，构造方法中传入字节输出流
     3、使用字节缓冲输入流对象中的read方法读取文件
     4、使用字节缓冲输出流中的方法write，把读取到的数据写入到目的地文件中
     5、释放资源（先把数据缓冲区中的数据刷新到文件中）

     结论：缓冲流的效率比基础流高很多。
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        // 1、创建一个字节缓冲输入流对象，构造方法中传入字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.jpeg"));
        //2、创建一个字节缓冲输出流对象，构造方法中传入字节输出流
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("c:\\tmp\\1.jpeg"));
        /*
        // 3、使用字节缓冲输入流对象中的read方法读取文件
        //3.1 一次读取一个字符  17毫秒
        int len =0;
        while ((len = bis.read())!=-1){
            bos.write(len);
        }
        */

        // 3、使用字节缓冲输入流对象中的read方法读取文件
        //3.2 一次读取多个字符   2毫秒
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //5、释放资源（先把数据缓冲区中的数据刷新到文件中）
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
