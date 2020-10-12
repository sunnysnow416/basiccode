package com.sunnysnow.jdbctemplatedemo;

import com.sunnysnow.druiddemo.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate入门学习
 * 与druid一起使用
 *
 * Spring框架对JDBC的简单封装，提供一个JDBCTemplate对象简化JDBC的开发
 * 步骤：
 * 1、导入jar
 * 2、创建JdbcTemplate对象，依赖于数据源DataSource
 *       JdbcTemplate template = new JdbcTemplate(ds);
 * 3、使用JdbcTemplate的方法完成CRUD的操作
 *      update():
 *      queryForMap():
 *      queryForList():
 *      query():
 *      queryForObject():
 */
public class JdbcTemplateDemo {
    public static void main(String[] args) {
        //1.导入jar包
        /*
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.2.8.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.1.3.RELEASE</version>
        </dependency>
         */
        //2.创建jdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用
        String sql="update account set money=5000 where id=? ";
        int count = template.update(sql, 4);
        System.out.println("影响的条数为："+count);
    }
}
