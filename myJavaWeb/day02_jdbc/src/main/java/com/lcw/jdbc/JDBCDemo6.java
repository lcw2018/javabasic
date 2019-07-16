package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */

import java.sql.*;

/**
 * 查询操作
 */
public class JDBCDemo6 {

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

            //获取执行sql的对象

            stmt = conn.createStatement();


            //执行sql语句,得到结果集对象

            rs = stmt.executeQuery(sql);

            //遍历结果集对象

            rs.next();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            System.out.println(id + "--" + name + "---" + money);


            rs.next();
            int id2 = rs.getInt("id");
            String name2 = rs.getString("name");
            double money2 = rs.getDouble("money");
            System.out.println(id2 + "--" + name2 + "---" + money2);


            rs.next();
            int id3 = rs.getInt("id");
            String name3 = rs.getString("name");
            double money3 = rs.getDouble("money");
            System.out.println(id3 + "--" + name3 + "---" + money3);


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
