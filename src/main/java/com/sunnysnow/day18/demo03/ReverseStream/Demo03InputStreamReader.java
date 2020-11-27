package com.sunnysnow.day18.demo03.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
     转换流：输入流
    java.io.InputStreamReader  extends Reader
    作用：InputStreamReader是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符 。
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。（解码，把看不懂的转成看的懂的）

    共性的成员方法：
        int read() ：读一个字符并返回
        int read(char[] cbuf) ：一次读取多个字符，将字符读入数组。
        abstract void close() ：关闭流并释放与之相关联的任何系统资源。

    构造方法：
        InputStreamReader(InputStream in)创建一个使用默认字符集的InputStreamReader。
        InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
        参数：
            InputStream in ：字节输入流，用来读取文件中保存的字节
            String charsetName ：编码表名称，不区分大小写，可以是utf-8 UTF-8 GBK gbk，不指定，默认是utf-8

    使用步骤：
        1、创建一个InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2、使用InputStreamReader对象中的方法read读取文件
        3、释放资源

    注意事项：
        1、构造方法中指定的编码表名称要和文件的编码相同
 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
//        Read_uft8();
        Read_GBK();
    }

    private static void Read_GBK() throws IOException {
        //1、创建一个InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\GBK.txt"),"GBK");
        // 2、使用InputStreamReader对象中的方法read读取文件
        int len =0;
        while ((len=isr.read())!=-1){
            System.out.print((char) len);
        }
        // 3、释放资源
        isr.close();
    }

    private static void Read_uft8() throws IOException {
        //1、创建一个InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\10_IO\\files\\utf-8.txt"),"utf-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\10_IO\\files\\utf-8.txt")); //默认为utf-8
        // 2、使用InputStreamReader对象中的方法read读取文件
        int len =0;
        while ((len=isr.read())!=-1){
            System.out.print((char) len);
        }
        // 3、释放资源
        isr.close();
    }
}
