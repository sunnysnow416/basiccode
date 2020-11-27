package com.sunnysnow.day17.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    close方法和flush方法的区别
        flush：刷新缓冲区，流对象可继续使用
        close：先刷新到缓冲区，然后通知系统释放资源，流不能继续使用。

 */
public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        // 1、创建FileWriter对象，构造方法中板顶要写入数据的目的地
        FileWriter fw = new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\e.txt");
        //2、使用FileWriter中的方法write把数据写入到内存缓冲区中（字符转换为字节的过程）
        //写单个字符
        fw.write(97);
        fw.flush();
        fw.write(100);//流可以继续使用
        fw.flush();
        fw.close();
        //close后流已经关闭，流不能再使用，会报错IOException
        //fw.write(99);
    }
}
