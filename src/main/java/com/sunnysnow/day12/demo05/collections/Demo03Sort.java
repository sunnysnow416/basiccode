package com.sunnysnow.day12.demo05.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections  是集合工具类，用来对集合进行操作，部分方法如下：
        static <T> void sort(List<T> list, Comparator<? super T> c) :将集合中的元素按指定的规则进行排序。
    Comparator和Comparable的区别：
        Comparable：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较规则compareTo方法
        Comparator：相当于找一个第三方的裁判，比较两个
    Comparator 排序规则：
        o1-o2:升序
        o2-o1:降序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1-o2; //升序
                return o2-o1; //降序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a小名",12));
        list02.add(new Student("小花",14));
        list02.add(new Student("刘璐",10));
        list02.add(new Student("b杨幂",12));

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按年龄升序
                //return o1.getAge()-o2.getAge();
                //按年龄降序
                return o2.getAge()-o1.getAge();
            }
        });

        /*扩展了解
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按年龄升序排序
                int result = o1.getAge()-o2.getAge();
                //如果两个人的年龄相同，按姓名的第一个字比较
                if(result==0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
         */

        System.out.println(list02);
    }
}
