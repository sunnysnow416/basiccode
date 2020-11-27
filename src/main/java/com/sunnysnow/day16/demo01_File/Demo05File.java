package com.sunnysnow.day16.demo01_File;

import java.io.File;
import java.io.IOException;

/**
 *  File类创建删除功能的方法
 *      public boolean createNewfile()  :当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
 *
 */
public class Demo05File {
    public static void main(String[] args) {
        show01();
    }

    /**
     *  public boolean createNewfile()  :当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
     *  创建文件的路径和名称在构造方法中给出（构造方法的参数）
     *  返回值：布尔值
     *      true: 文件不存在，创建文件，返回true
     *      false:文件存在，不会创建，返回false
     *  注意：
     *      此方法只能创建文件，不能创建文件夹
     *      创建文件的路径必须存在，否则抛出异常
     *
     *  public boolean createNewfile() throws IOException
     *  createNewfile声明抛出了IOException，我们调用这个方法，必须处理这个异常，要么throws要么trycatch
     */
    private static void show01() {
        File f1 =new File("D:\\ideaworkspace\\projects\\08_FileAndRecursion\\1.txt"); //绝对路径
        boolean b1 = false;
        try {
            b1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b1);  //true


        File f2 =new File("items\\2.txt"); //相对路径


    }
}
