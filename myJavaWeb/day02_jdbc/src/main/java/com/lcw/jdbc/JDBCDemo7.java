package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */

import java.sql.*;

/**
 * 查询操作，循环优化
 */
public class JDBCDemo7 {


    public static void main(String[] args) {


        Connection conn = null;


        Statement stmt = null;


        ResultSet rs = null;


        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //获取连接对象

            conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "18772305906");

            //编写sql语句

            String sql = "select * from account";

            //获取执行sql语句的对象
            stmt = conn.createStatement();


            //执行sql,获得结果集

            rs = stmt.executeQuery(sql);

            //循环遍历结果集

            while (rs.next()) {

                int id = rs.getInt("id");

                String name = rs.getString("name");


                double money = rs.getDouble("money");


                System.out.println(id + "---" + name + "---" + money);


            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源

            if (rs != null) {

                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }


            }

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
