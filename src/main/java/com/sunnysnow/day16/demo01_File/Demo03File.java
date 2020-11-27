package com.sunnysnow.day16.demo01_File;

import java.io.File;

/**
 * File类获取功能的方法
 *  public String getAbsolutePath() :返回次File的绝对路劲名字符串
 *  public Stirng getPath() :将次File转换为路径名字符串
 *  public String getName() :返回由此File表示的文件或目录的名称
 *  public lang length()   :返回由此File表示的文件的长度
 */
public class Demo03File {

    public static void main(String[] args) {
        show04();
    }

    /**
     *  public lang length()   :返回由此File表示的文件的长度
     *  获取的是构造方法指定的文件大小，以字节为单位
     * 注意：
     *  文件夹是没有大小的，不能获取文件夹的大小。
     *  如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {
        File f1 = new File("D:\\ideaworkspace\\files\\a\\1.png");
        long length1 = f1.length();
        System.out.println(length1);  //43909字节

        File f2 = new File("D:\\ideaworkspace\\files\\a\\2.png");
        long length2 = f2.length();
        System.out.println(length2);//a目录下没有2.png的文件，返回0

        File f3 = new File("D:\\ideaworkspace\\files\\a");
        long length3 = f3.length();
        System.out.println(length3); //文件夹的大小返回0
    }

    /**
     * public String getName() :返回由此File表示的文件或目录的名称
     * 获取的是就构造方法传路径的结尾部分（文件/文件夹）
     */
    private static void show03() {
        File f1 =new File("D:\\ideaworkspace\\files\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);  //a.txt

        File f2 =new File("D:\\ideaworkspace\\files");
        String name2 = f2.getName();
        System.out.println(name2);  //files
    }

    /**
     *  public Stirng getPath() :将次File转换为路径名字符串
     *  获取的构造方法中传递的路径
     *  tostring方法调用的是getPath方法
     *  源码：
     *      public String toString(){
     *          return getPath();
     *      }
     */
    private static void show02() {
        File f1 =new File("D:\\ideaworkspace\\files\\a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);  //D:\ideaworkspace\files\a.txt

        File  f2=new File("a.txt");
        String path2 = f2.getPath();
        System.out.println(path2);  //a.txt

        System.out.println(f1); //D:\ideaworkspace\files\a.txt
        System.out.println(f1.toString()); //D:\ideaworkspace\files\a.txt

    }

    /**
     *  public String getAbsolutePath() :返回次File的绝对路劲名字符串
     *  获取的构造方法中传递的路径
     *  无论路径是相对的还是绝对的，getAbsolutePath方法返回的都是绝对路劲
     */
    private static void show01() {
        File f1 =new File("D:\\ideaworkspace\\files\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1); //D:\ideaworkspace\files\a.txt

        File  f2=new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);  //D:\ideaworkspace\projects\items\a.txt
    }
}
