package com.sunnysnow.day16.demo01_File;

import java.io.File;

/**
 *  File判断功能的方法
 *
 */
public class Demo04File {
    public static void main(String[] args) {
        show01();
    }

    /**
     *  public boolean isDirectory()    ：此File表示的是否为目录
     *      用于判断构造方法中给定的路径是否以文件结尾
     *  public boolean isfile() :此File表示的是否为文件
     *      用于判断构造方法中给定的路径是否以文件结尾
     *  注意：
     *      电脑的硬盘中只有文件/文件夹，两个方法是互斥
     *      这个两个方法使用前提，路径必须是存在的，否则返回false
     */
    private static void show02() {
        File f1 =new File("D:\\ideaworkspace\\files2");  //实际此文件夹路径不存在
        //如果不存在，就没必要获取
        if(f1.exists()){
            System.out.println(f1.isFile());
            System.out.println(f1.isDirectory());
        }

        File f2 =new File("D:\\ideaworkspace\\files");  //实际此文件夹路径存在
        if(f2.exists()){
            System.out.println(f2.isFile()); //false
            System.out.println(f2.isDirectory());  //true
        }

        File f3 =new File("D:\\ideaworkspace\\files\\a.txt");  //实际此文件夹路径存在
        if(f3.exists()){
            System.out.println(f3.isFile()); //true
            System.out.println(f3.isDirectory());  //false
        }
    }

    /**
     *  public boolean exists() :此File表示的文件或路径是否实际存在。
     *  用于判断构造方法中的路径是否存在
     *      存在：true
     *      不存在：false
     */
    private static void show01() {
        File f1 =new File("D:\\ideaworkspace\\files"); //绝对路径
        System.out.println(f1.exists());  //ture

        File f2 =new File("D:\\ideaworkspace\\files2");
        System.out.println(f2.exists());  //false

        File f3 =new File("aa11.txt");
        System.out.println(f3.exists());  //相对路径。根目录中实际存在此文件，true

        File f4 =new File("bb.txt");
        System.out.println(f4.exists());  //根目录中实际不存在此文件，false
    }
}
