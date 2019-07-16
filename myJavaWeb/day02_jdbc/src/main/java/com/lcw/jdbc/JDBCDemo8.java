package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */


import com.lcw.domain.Account;
import com.lcw.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * * 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBCDemo8 {


    public static void main(String[] args) {

        JDBCDemo8 jdbcDemo8 = new JDBCDemo8();
        List<Account> accounts = jdbcDemo8.findAll2();
        for (Account a :
                accounts) {

            System.out.println(a);
        }


    }

    public List<Account> findAll() {
        Connection conn = null;


        Statement stmt = null;


        ResultSet rs = null;
        ArrayList<Account> accounts = null;

        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //获取连接对象

            conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "18772305906");

            //编写数据库

            String sql = "select * from account";


            //获取执行数据库的对象

            stmt = conn.createStatement();


            //执行sql

            rs = stmt.executeQuery(sql);


            //封装结果
            accounts = new ArrayList<Account>();

            while (rs.next()) {

                Account account = new Account();

                int id = rs.getInt("id");
                String name = rs.getString("name");
                double money = rs.getDouble("money");

                account.setId(id);
                account.setName(name);
                account.setMoney(money);

                accounts.add(account);
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

        return accounts;
    }


    public List<Account> findAll2() {


        Connection conn = null;

        Statement stmt = null;

        ResultSet rs = null;


        ArrayList<Account> accounts =new ArrayList<Account>();

        try {

            //获取连接对象
            conn = JDBCUtils.getConnection();
            //编写数据库
            String sql = "select * from account";

            //获取执行sql语句的对象

            stmt = conn.createStatement();


            //执行sql语句,获取结果集对象

            rs = stmt.executeQuery(sql);



            while (rs.next()) {
                Account account = new Account();
                int id = rs.getInt("id");

                String name = rs.getString("name");


                double money = rs.getDouble("money");


                account.setId(id);

                account.setName(name);

                account.setMoney(money);
                accounts.add(account);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.close(rs, stmt, conn);
        }
        return accounts;
    }


}