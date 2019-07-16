package com.lcw.util;

/**
 * Create by chuanwen.li on 2019/6/6
 */


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * 定义工具类
 */
public class JDBCUtils {

    private static String url;

    private static String username;


    private static String password;


    private static String driver;


    static {


        try {
            Properties pro = new Properties();


            ClassLoader classLoader = JDBCUtils.class.getClassLoader();


            URL resource = classLoader.getResource("jdbc.properties");

            String path = resource.getPath();
            pro.load(new FileReader(path));

            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");

            //注册驱动
            Class.forName(driver);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    //获取连接对象
    public static Connection getConnection() throws SQLException {


        return DriverManager.getConnection(url, username, password);

    }

    //释放资源
    public static void close(Statement stmt, Connection conn) {

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


    //释放资源
    public static void close(ResultSet rs, Statement stmt, Connection conn) {


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
