package com.sunnysnow.jdbcdemo;

import java.sql.*;
import java.util.Scanner;

/**
 * 联系jdbc，模拟用户登录
 * 抽取公共的工具类，并调用
 */
public class Login2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        String sql = "select * from user where username=? and password=?";
        conn = JdbcUtil.getConntion();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("登录成功");
            } else {
                System.out.println("用户名或密码错误");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.release(rs,pstmt,conn);
        }
    }

}
