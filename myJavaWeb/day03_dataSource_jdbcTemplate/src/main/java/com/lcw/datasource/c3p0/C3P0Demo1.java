package com.lcw.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Create by chuanwen.li on 2019/6/6
 */
public class C3P0Demo1 {

    public static void main(String[] args) throws SQLException {

        //创建数据库连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        //获取连接对象
        Connection conn = dataSource.getConnection();


        //打印结果
        System.out.println(conn);//com.mchange.v2.c3p0.impl.NewProxyConnection@4c75cab9 [wrapping: com.mysql.jdbc.JDBC4Connection@1ef7fe8e]


    }


}
