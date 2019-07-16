package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 * <p>
 * account表，添加记录
 */
/**
 * account表，添加记录
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 向account表中添加一条数据 insert语句
 */
public class JDBCDemo2 {

    public static void main(String[] args) {

        Connection conn = null;

        Statement stmt = null;
        try {


            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //获取Connection对象

            conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "18772305906");


            //编写sql语句

            String sql = "insert into account values(null,'柯凡',300)";


            //获取执行sql的statement语句

            stmt = conn.createStatement();

            //执行sql

            int count = stmt.executeUpdate(sql);

            //影响的行数
            System.out.println(count);


            if (count > 0) {

                System.out.println("添加成功！");

            } else {

                System.out.println("添加失败！");

            }


        } catch (Exception e) {
            e.printStackTrace();
            //释放资源
        } finally {

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
