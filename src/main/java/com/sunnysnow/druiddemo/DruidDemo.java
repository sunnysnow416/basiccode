package com.sunnysnow.druiddemo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * druid基本演示
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //1.导包使用maven依赖如下
        /*
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>1.0.9</version>
            </dependency>
         */

        //2.定义配置文件druid.properties
        //3.加载配置文件
        Properties pro = new Properties();
        InputStream fin = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(fin);
        //4.获得连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //5.获取连接
        Connection conn = ds.getConnection();
        //6.打印对象，看是否获取到
        System.out.println(conn);

    }
}
