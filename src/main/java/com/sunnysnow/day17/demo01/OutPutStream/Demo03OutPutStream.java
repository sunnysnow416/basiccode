package com.sunnysnow.day17.demo01.OutPutStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写：使用两个参数的构造方法
        FileOutputStream(File file, boolean append)：创建文件输出流以写入由指定的 File对象表示的文件。
        FileOutputStream(String name, boolean append)：创建文件输出流以指定的名称写入文件。
        参数：
          File file、  String name 写入数据的目的地
          boolean append：追加写开关
            true:创建对象不会覆盖原文件，继续在文件末尾追加写数据。
            false：创建一个新文件，覆盖原文件
      写换行：
        windows：\r\n
        linux：/n
        mac:/r
 */
public class Demo03OutPutStream {
    public static void main(String[] args) throws IOException {
        //追加写
        FileOutputStream fos = new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\c.txt",true);
        for(int i=0;i<10;i++){
            fos.write("你好".getBytes()); //追加写
            fos.write("\r\n".getBytes()); //写换行
        }
        fos.close();
    }
}
