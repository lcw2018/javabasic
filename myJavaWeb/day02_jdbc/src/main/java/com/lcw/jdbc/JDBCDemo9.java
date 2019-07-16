package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */

import com.lcw.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 需求：1.键盘输入用户名和密码密码
 * 2.判断用户是否登录成功
 */
public class JDBCDemo9 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");

        String username = sc.nextLine();

        System.out.println("请输入密码");

        String password = sc.nextLine();
        boolean login = new JDBCDemo9().login2(username, password);

        if (login) {


            System.out.println("恭喜您，登录成功！");
        } else {

            System.out.println("用户名或密码错误");

        }


    }

    /**
     * 登录方法
     *
     * @param username
     * @param password
     * @return
     */

    public boolean login(String username, String password) {

        try {
            //获取连接对象
            Connection conn = JDBCUtils.getConnection();


            //编写sql语句
            String sql = "select * from user where username='" + username + "' and password ='" + password + "' ";


            //获取执行SQL语句的对象
            Statement stmt = conn.createStatement();


            //执行sql
            ResultSet rs = stmt.executeQuery(sql);


            return rs.next();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    /**
     * 登录方法，使用preparement对象
     *
     * @return
     */
    public boolean login2(String username, String password) {


        try {


            //获取连接对象
            Connection conn = JDBCUtils.getConnection();


            //编写sql语句
            String sql = "select * from user where username=? and password =?";


            //获取执行sql语句的对象

            PreparedStatement pstmt = conn.prepareStatement(sql);

            //设置参数,给？占位符赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);


            //执行sql语句

            ResultSet rs = pstmt.executeQuery();

            return rs.next();


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }


}
