package com.sunnysnow.day17.demo07.Prop;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties 集合 extends HashTable<key,value> implements Map<k,v>
    Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。
    Properties集合是唯一一个和IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据， 持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
    属性列表中每个键以及对应的值都是一个字符串：
        Properties集合是一个双链集合，key和value默认都是字符串
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        重点load方法：
        void load(InputStream inStream) 从输入字节流读取属性列表（键和元素对）。
        void load(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
        参数：
            InputStream inStream ：不能读取含有中文的键值对
            Reader reader ：能读取含有中文的键值对.推荐使用字符流
        使用步骤：
        1、创建Properties集合对象
        2、使用Properties集合对象中的方法load读取保存键值对的文件
        3、遍历Properties集合
        注意事项：
            1、存储键值对的文件中，键与值默认的连接符号使用=，空格（其他符号）
            2、存储键值对的文件中，使用#进行注释，被注释的键值对不会被读取
            3、存储键值对的文件中，键与值默认都是字符串，不用再加引号
     */
    private static void show03() throws IOException {
        //1、创建Properties集合对象
        Properties prop = new Properties();
        /*
        //2、使用Properties集合对象中的方法load读取保存键值对的文件
        //使用字节流读取
        FileInputStream fis =new FileInputStream("E:\eclipse\IJworkspace\allitems\basiccode\src\main\resources\17files\\prop2.txt");
        prop.load(fis);
        //3、遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+"-->"+value);
        }
        fis.close();
         */
        //2、使用Properties集合对象中的方法load读取保存键值对的文件
        //使用字符输入流
        FileReader fr =new FileReader("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\prop.txt");
        prop.load(fr);
        //3、遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+"-->"+value);
        }
    }

    /*
        可以使用Properties集合中的方法store，把集合中的临时数据， 持久化写入到硬盘中存储
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数：
            OutputStream out :字节输出流，不能写入中文
            Writer writer ：字符输出流，可以写入中文
            String comments ：注释用来解释说明保存的文件是做什么用的，不能使用中文，会产生乱码默认是unicode编码，一般使用空字符串
        使用步骤：
            1、创建Properties集合对象，添加数据
            2、创建字节输出流/字符输出流对象，构造方法中绑定要输出的对象
            3、使用Properties集合中的方法store把集合中的临时数据， 持久化写入到硬盘中存储
            4、释放资源
     */
    private static void show02() throws IOException {
        //1、创建Properties集合对象，添加数据
        Properties prop = new Properties();
        /*
        prop.setProperty("赵丽颖","168");
        prop.setProperty("古力娜扎","158");
        prop.setProperty("迪丽热巴","165");
        // 2、创建字节输出流/字符输出流对象，构造方法中绑定要输出的对象
        //字节输出流
        FileWriter fw = new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\09_IoAndProperties\\files\\prop.txt");
        //3、使用Properties集合中的方法store把集合中的临时数据， 持久化写入到硬盘中存储
        prop.store(fw,"save data");
        fw.close();
        */

        prop.setProperty("zhao","168");
        prop.setProperty("xian","158");
        prop.setProperty("ma","165");
        // 2、创建字节输出流/字符输出流对象，构造方法中绑定要输出的对象
        //字节输出流
        FileOutputStream fos =new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\09_IoAndProperties\\files\\prop2.txt");
        //3、使用Properties集合中的方法store把集合中的临时数据， 持久化写入到硬盘中存储
        prop.store(fos,"save data");
        //4、释放资源
        fos.close();
    }

    /*
     使用Properties集合存储数据，遍历取出Properties集合中的数据
     Properties集合是一个双链集合，key和value默认都是字符串
     Properties集合有一些操作字符串的特有方法
        Object setProperty(String key, String value) 调用Hashtable方法 put 。
        String getProperty(String key) 通过key找到value值，相当于Map集合中的get方法
        Set<String> stringPropertyNames() 返回此属性列表中的一组键，其中键及其对应的值为字符串.此方法相当于Map集合中的keyset方法
     */
    private static void show01() {
        //创建Properties集合对象
        Properties prop = new Properties();
        //私有setProperty往集合中添加数据
        prop.setProperty("赵丽颖","168");
        prop.setProperty("古力娜扎","158");
        prop.setProperty("迪丽热巴","165");

        //使用stringPropertyNames把prop集合中的键存储到set集合中
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+"-->"+value);
        }
    }
}
