package com.sunnysnow.jdbcdemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
    private static String dbUrl;
    private static String username;
    private static String password;
    private static String driver;

    static {
        try {
            Properties pro = new Properties();
            String path = JdbcUtil.class.getClassLoader().getResource("dataBaseInfo.properties").getPath();
            pro.load(new FileReader(path));
            dbUrl = pro.getProperty("db.url");
            username = pro.getProperty("db.username");
            password = pro.getProperty("db.password");
            driver = pro.getProperty("db.driver");
            //注册驱动
            Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取链接
     */
    public static  Connection getConntion(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放资源
     * 一个一个if写更合理
     * @param rs
     * @param pstmt
     * @param conn
     */
    public static void release(ResultSet rs, PreparedStatement pstmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 释放资源-重载
     * @param pstmt
     * @param conn
     */
    public static void release(PreparedStatement pstmt, Connection conn){
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
