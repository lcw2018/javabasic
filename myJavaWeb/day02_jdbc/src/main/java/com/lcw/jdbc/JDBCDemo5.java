package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 执行DDL语句
 */
public class JDBCDemo5 {


    public static void main(String[] args) {

        Connection conn = null;

        Statement stmt = null;


        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");


            //获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "18772305906");


            //编写sql语句


            String sql = "create table user(id int,name varchar(20))";

            //获取执行sql的对象
            stmt = conn.createStatement();

            //执行sql语句

            int count = stmt.executeUpdate(sql);

            //处理结果
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            //释放资源

            if (stmt != null) {

                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (conn != null) {

                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }


            }

        }


    }


}
