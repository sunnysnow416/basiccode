package com.sunnysnow.day18.demo01.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream :字节缓冲输出流

    继承自父类的共性成员方法：
        void close():关闭此输出流并释放与此流相关联的任何系统资源。
        void flush():刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b):将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len):从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b):将指定的字节写入此输出流。
    构造方法：
    BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
    BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流。
    参数：
        OutputStream out：字节输出流
        我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率。
        int size ：指定缓冲流内部的缓冲区大小，不指定使用默认。
    使用步骤：
        1、创建一个FileOutputStream对象，构造方法中绑定要输出的目的地
        2、创建BufferedOutputStream对象，构造方法中传入FileOutputStream对象，提高FileOutputStream的写入效率。
        3、使用BufferedOutputStream对象中的方法write，把数据写入到内部的缓冲区中
        4、使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
        5、释放资源（会先调用flush方法刷新数据，所以第四步可以省略）

 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1、创建一个FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos =new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\buffer01.txt");
        // 2、创建BufferedOutputStream对象，构造方法中传入FileOutputStream对象，提高FileOutputStream的写入效率。
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3、使用BufferedOutputStream对象中的方法write，把数据写入到内部的缓冲区中
        bos.write("你好中国".getBytes());
        // 4、使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
        bos.flush();
        // 5、释放资源（会先调用flush方法刷新数据，所以第四步可以省略）
        //只要关闭缓冲流即可，会自动关闭基本流，不用写fos.close()
        bos.close();
    }
}
