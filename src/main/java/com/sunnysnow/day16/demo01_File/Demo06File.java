package com.sunnysnow.day16.demo01_File;

import java.io.File;

/*
    File 类遍历（文件夹）目录的功能
    public String[] List():返回一个Strng数组，表示该File目录中所有有子文件或目录。

    注意事项：
        List方法和ListFiles方法，遍历的是构造方法中给出的目录
        如果构造方法中的目录路劲不存在，则会抛出空指针异常。
        如果构造方法中给出的目录路劲不是一个目录，则也会抛出空指针异常。
 */
public class Demo06File {
    public static void main(String[] args) {
        show02();
    }

    /**
     *  public File[] ListFiles():返回一个File数组，表示File目录中的所有有的子文件或目录
     *  遍历构造方法中给出的目录，会获取目录中所有的文件和文件夹，把文件/文件夹封装为File对象，多个File对象存储到File数组中
     */
    private static void show02() {
        File file = new File("E:\\eclipse\\IJworkspace\\allitems\\08_FileAndRecursion\\src\\files"); //返回改目录下的文件夹和文件名
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("file:"+file1);
        }
    }

    /**
     *  public String[] List():返回一个Strng数组，表示该File目录中所有有子文件或目录。
     *  遍历构造方法中给出的目录，会获取目录中所有文件或文件夹的名称，包括隐藏文件和文件夹
     *  把多个名称存储到一个Sting类型的数组中。
     */
    private static void show01() {
        File file = new File("E:\\eclipse\\IJworkspace\\allitems\\08_FileAndRecursion\\src\\files"); //返回改目录下的文件夹和文件名
//        File file = new File("E:\\eclipse\\IJworkspace\\allitems\\08_FileAndRecursion\\src\\files\\1.txt");   //NullPointerException
//        File file = new File("E:\\eclipse\\IJworkspace\\allitems\\08_FileAndRecursion\\src\\files333");   //NullPointerException

        String[] list = file.list();
        for (String s : list) {
            System.out.println("s:"+s);
        }
    }
}
