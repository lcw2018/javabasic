package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表，修改记录
 */
public class JDBCDemo3 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {

            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //获取连接数据库的对象
            conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "18772305906");
            //编写数据库语句
            String sql = "update account set money=200 where id=20";

            //获取执行数据库语句的对象
            stmt = conn.createStatement();

            //执行sql语句
            int count = stmt.executeUpdate(sql);

            //影响的行数
            System.out.println(count);

            if (count > 0) {
                System.out.println("修改成功！");

            } else {

                System.out.println("修改失败！");

            }


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
