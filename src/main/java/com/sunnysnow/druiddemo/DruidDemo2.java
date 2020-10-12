package com.sunnysnow.druiddemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用工具类JDBCUtils
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        /**
         * 完成添加操作
         * 往accout表中添加一条记录
         */

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql ="insert into account values(null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给pstmt对象赋值
            pstmt.setString(1,"wangwu");
            pstmt.setFloat(2,1000);
            //5.执行sql
            int i = pstmt.executeUpdate();
            System.out.println("共执行记录数："+i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }


    }
}
