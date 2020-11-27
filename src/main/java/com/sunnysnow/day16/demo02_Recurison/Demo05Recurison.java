package com.sunnysnow.day16.demo02_Recurison;

import java.io.File;

/**
 *  递归打印多级目录
 *  需求：打印目录的.java文件
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\1..txt
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\2.java
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\aaa
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\aaa\a.jpeg
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\aaa\a.txt
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\bbb
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\bbb\b.java
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\bbb\b.txt
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\我是隐藏文件.txt
 *      E:\eclipse\IJworkspace\allitems\08_FileAndRecursion\src\files\我是隐藏文件夹
 *
 */
public class Demo05Recurison {
    public static void main(String[] args) {
        File f = new File("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\16files");
        getAllFiles(f);
    }

    /**
     * 定义一个方法，参数传递File类型的目录
     * 方法中对目录进行遍历
     */
    public static void getAllFiles(File dir){
//        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFiles(file);
            }else{
                /**
                 * 只要.java结尾的文件
                 * 1.把File对象转化为string对象
                 * file.getName();
                 * file.getPath();
                 * file.toString();
                 */
                if(file.toString().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }

            }
        }
    }
}
