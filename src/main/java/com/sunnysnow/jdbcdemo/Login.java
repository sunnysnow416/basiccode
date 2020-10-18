package com.sunnysnow.jdbcdemo;

import java.sql.*;
import java.util.Scanner;

/**
 * 练习jdbc，模拟用户登录
 */
public class Login {

    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.16.112:3306/mqqcourse";
        String username = "root";
        String pwd = "123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        //1.加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, pwd);
            String sql = "select * from user where username=? and password=?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, password);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("登录成功");
            } else {
                System.out.println("用户名或密码错误");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
