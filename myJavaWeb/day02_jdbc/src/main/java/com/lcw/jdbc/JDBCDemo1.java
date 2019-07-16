package com.lcw.jdbc;

import java.sql.*;

/**
 * Create by chuanwen.li on 2019/6/5
 */
public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //编写sql语句
        String sql = "select * from account";

        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ssm");

        //获取执行sql的对象
        Statement stmt = conn.createStatement();
        //处理结果集对象
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");

            System.out.println(id + "--" + name + "" + money);

        }
        //释放资源
        rs.close();

        stmt.close();

        conn.close();


    }


}
