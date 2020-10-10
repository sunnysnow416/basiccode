package com.sunnysnow.jdbcdemo;

import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 使用事务，转账demo
 */
public class Account {
    public  static  Connection conn =null;
    public  static PreparedStatement pstmt1 =null;
    public  static PreparedStatement pstmt2 =null;
    public  static ResultSet rs =null;

    public static void getAcount(float m,int aId,int bId ){
        try {
            conn = JdbcUtil.getConntion();
            String sql1="update account set money=money-? where id=?";
            String sql2="update account set money=money+? where id=?";
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt1.setFloat(1,m);
            pstmt1.setInt(2,aId);

            pstmt2.setFloat(1,m);
            pstmt2.setInt(2,bId);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.release(rs,pstmt1,conn);
            JdbcUtil.release(rs,pstmt2,conn);
        }
    }

    public static void main(String[] args) {
        getAcount(500,1,2);

    }
}
