package com.sunnysnow.day18.demo01.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.BufferedInputStream  extends FilterInputStream
    BufferedInputStream 字节缓冲输入流
    继承自父类的共性成员方法：
        abstract int read() ：从输入流读取数据的下一个字节。
        int read(byte[] b) ：从输入流读取一些字节数，并将它们存储到缓冲区 b 。
        void close() ：关闭此输入流并释放与流相关联的任何系统资源。

    构造方法：
        BufferedInputStream(InputStream in) 创建一个 BufferedInputStream并保存其参数，输入流 in ，供以后使用。
        BufferedInputStream(InputStream in, int size) 创建 BufferedInputStream具有指定缓冲区大小，并保存其参数，输入流 in ，供以后使用。
    参数：
        InputStream in ：字节输入流
            我们可以传递FileInputStream,冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的写入效率。
        int size :指定缓冲流内部的缓冲区大小，不指定使用默认
    使用步骤：
        1、创建一个FileInputStream对象，构造方法中绑定读取的数据源
        2、创建BufferedInputStream对象，构造方法中传入FileInputStream对象，提高FileInputStream的写入效率。
        3、使用BufferedInputStream对象中的方法read读取文件
        4、释放资源
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        // 1、创建一个FileInputStream对象，构造方法中绑定读取的数据源
        FileInputStream fis =new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\buffer01.txt");
        // 2、创建BufferedInputStream对象，构造方法中传入FileInputStream对象，提高FileInputStream的写入效率。
        BufferedInputStream bis = new BufferedInputStream(fis);

         /*
         // 3、使用BufferedInputStream对象中的方法read读取文件
         //一次读一个字节
        int len =0;
        while ((len = bis.read())!=-1){
            System.out.print((char) len);
        }
       */

         //3、使用BufferedInputStream对象中的方法read读取文件
        //一次读多个字节,效率更高
        byte[] bytes = new byte[1024];
        int len=0;
        while((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //4、释放资源.只要关闭缓冲流即可，会自动关闭基本流，不用写fis.close()
        bis.close();
    }
}
