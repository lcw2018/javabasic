package com.lcw.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Create by chuanwen.li on 2019/6/6
 */
public class C3P0Demo2 {


    public static void main(String[] args) throws SQLException {

    /*    //创建数据库连接池对象，使用默认配置
        ComboPooledDataSource dataSource = new ComboPooledDataSource();


        for (int i = 1; i <= 11; i++) {

            //获取连接对象
            Connection conn = dataSource.getConnection();


            System.out.println(i + ":" + conn);


            if (i == 5) {
                conn.close();

            }


        }*/

        testNamedConfig();


    }


    public static void testNamedConfig() throws SQLException {


        //创建数据库连接池对象，使用otherc3p0

        ComboPooledDataSource dataSource = new ComboPooledDataSource("otherc3p0");


        for (int i = 1; i <= 10; i++) {


            //获取连接对象
            Connection conn = dataSource.getConnection();

            //打印结果
            System.out.println(i + ":" + conn);

        }


    }
}
