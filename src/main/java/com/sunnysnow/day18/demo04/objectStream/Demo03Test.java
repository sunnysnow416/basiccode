package com.sunnysnow.day18.demo04.objectStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    练习：序列化集合
    当我们想在文件中保存多个对象的时候，
    可以把多个对象存储到集合中，对集合进行序列化和反序列化
    分析：
        1、创建一个ArrayList集合
        2、往ArrayList中存储对象
        3、创建一个序列化ObjectOutputStream对象
        4、使用ObjectOutputStream对象中的方法writeObject方法，对集合进行序列化
        5、创建一个反序列化ObjectInputStream对象
        6、使用方法readObject方法，读取对象
        7、把Object类型的结合转化为ArrayList集合
        8、遍历集合
        9、关闭资源
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1、创建一个ArrayList集合
        List<Person> list = new ArrayList<>();
        // 2、往ArrayList中存储对象
        list.add(new Person("战三",56));
        list.add(new Person("李四",36));
        list.add(new Person("王五",13));
        list.add(new Person("克拉克",23));
        //3、创建一个序列化ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\list.txt"));
        //4、使用ObjectOutputStream对象中的方法writeObject方法，对集合进行序列化
        oos.writeObject(list);
        // 4、使用ObjectOutputStream对象中的方法writeObject方法，对集合进行序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\list.txt"));
        //6、使用方法readObject方法，读取对象
        Object object = ois.readObject();
        //7、把Object类型的结合转化为ArrayList集合
        ArrayList<Person> list2 =(ArrayList<Person>)object;
        // 8、遍历集合
        for (Person people : list2) {
            System.out.println(people.getName()+","+people.getAge());
        }
        // 9、关闭资源
        ois.close();
        oos.close();

    }
}
