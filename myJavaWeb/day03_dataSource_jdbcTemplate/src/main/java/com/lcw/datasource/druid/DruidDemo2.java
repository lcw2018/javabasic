package com.lcw.datasource.druid;

/**
 * Create by chuanwen.li on 2019/6/6
 */

import com.lcw.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用工具类
 */
public class DruidDemo2 {


    public static void main(String[] args) {


        Connection conn = null;

        PreparedStatement pstmt = null;

        try {
            //获取连接
            conn = JDBCUtils.getConnection();

            //编写sql语句

            String sql = "insert into account values(null,?,?)";

            //获取执行sql语句的对象

            pstmt = conn.prepareStatement(sql);

            //给？f赋值

            pstmt.setString(1, "佳依");

            pstmt.setDouble(2, 300.0);

            //执行sql语句,得到结果集

            int count = pstmt.executeUpdate();

            //输出插入的行数
            System.out.println(count);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            //释放资源
            JDBCUtils.close(pstmt, conn);


        }


    }


}
