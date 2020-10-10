package com.sunnysnow.jdbcdemo;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 获取用户信息，解析ResultSet结果集
 */
public class GetUserInfo {
    public static  Connection conn =null;
    public static  PreparedStatement pstmt =null;
    public static  ResultSet rs =null;

    public static void getUserInfo(){
        try {
            conn = JdbcUtil.getConntion();
            String sql="select * from user";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            User user =new User();
            while (rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String permission = rs.getString("permission");
                String isDelete = rs.getString("isDelete");
                int age = rs.getInt("age");

                user.setId(id);
                user.setUsername(username);
                user.setPassword(password);
                user.setSex(sex);
                user.setPermission(permission);
                user.setIsDelete(isDelete);
                user.setAge(age);

                System.out.println(user);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.release(rs,pstmt,conn);
        }
    }

    public static void main(String[] args) {
        getUserInfo();
    }
}
