package com.lcw.jdbcTemplate;

import com.lcw.domain.Account;
import com.lcw.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Create by chuanwen.li on 2019/6/6
 */
public class jdbcTemplateDemo1 {


    public static void main(String[] args) throws SQLException {

        //创建jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

        //编写sql语句

        String sql = "update account set money=500 where id=?";


        //执行sql语句

        int account = jdbcTemplate.update(sql, 24);

        System.out.println(account);


    }


}
