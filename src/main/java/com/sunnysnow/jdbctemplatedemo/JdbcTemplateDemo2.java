package com.sunnysnow.jdbctemplatedemo;

import com.sunnysnow.druiddemo.JDBCUtils;
import com.sunnysnow.jdbcdemo.User;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 基于用户表user的操作
 * DML:增删改
 * DQL:查询
 */
public class JdbcTemplateDemo2 {
    private  JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 1.将用户表中，修改1号用户的年龄为44
     */
    @Test
    public void test1(){
        String sql="update user set age=44 where id=1";
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 2.给用户表添加一个记录
     */
    @Test
    public void test2(){
        //这样可能导致sql注入，用预处理解决
//        String sql="insert into user values(null,'java','123456','1','1','1','30')";
//        int count = template.update(sql);
        String sql="insert into user values(null,?,?,?,?,?,?)";
        int count = template.update(sql,"java1","123456","1","1","1","30");
        System.out.println(count);
    }

    /**
     * 3.将刚添加的用户删除
     */
    @Test
    public void test3(){
        String sql="delete from user where id=?";
        //刚才添加的用户id为40
        int count = template.update(sql, 40);
        System.out.println(count);
    }

    /**
     * 4.查询用户表中将id为1的记录，将其封装为map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4(){
      String sql="select * from user where id=1";
        Map<String, Object> map = template.queryForMap(sql);
        System.out.println(map);
        //结果{id=1, username=zhangsan, password=123456, sex=0, permission=0, isDelete=0, age=44}
    }

    /**
     * 5、查询用户表中所有记录，将结果封装为List
     * 将每条记录封装为一个map集合，再将map集合封装到List集合中
     */
    @Test
    public void test5(){
        String sql="select * from user";
        List<Map<String, Object>> list = template.queryForList(sql);
        //使用快捷键iter，或者list.for
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    /**
     * 6.查询user表，查询所有记录，封装为javaBean（User）对象的List集合
     */
    @Test
    public void test6(){
        String sql="select * from user";
        List<User> list = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        for (User user : list) {
            System.out.println(user);
        }
    }

    /**
     * 查询总记录数
     * queryForObject 一般用来执行一些聚合函数的
     */
    @Test
    public void test7(){
        String sql = "select count(id) from user";
        Long count = template.queryForObject(sql, Long.class);
        System.out.println(count);
    }
}
