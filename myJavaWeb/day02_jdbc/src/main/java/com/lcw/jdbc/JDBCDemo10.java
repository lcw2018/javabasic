package com.lcw.jdbc;

/**
 * Create by chuanwen.li on 2019/6/5
 */

import com.lcw.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class JDBCDemo10 {


    public static void main(String[] args) throws SQLException {

        Connection conn = null;

        PreparedStatement pstm1 = null;
        PreparedStatement pstm2 = null;

        try {

            //获取连接对象
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);

            //编写sql语句

            String sql1 = "update account set  money=money-? where id=?";

            String sql2 = "update account set money=money+? where id =?";
            //获取执行sql语句的对象
            pstm1 = conn.prepareStatement(sql1);
            pstm2 = conn.prepareStatement(sql2);

            pstm1.setDouble(1, 200);
            pstm1.setInt(2, 18);

            pstm2.setDouble(1, 200);
            pstm2.setInt(2, 19);

            //执行sql
            pstm1.executeUpdate();

            int i = 3 / 0;


            pstm2.executeUpdate();

            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();

            if (conn != null) {
                conn.rollback();
            }
        } finally {


            JDBCUtils.close(pstm1, conn);


            JDBCUtils.close(pstm2, null);

        }


    }


}
