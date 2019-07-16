package com.lcw.dao;

import com.lcw.domain.User;
import com.lcw.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Create by chuanwen.li on 2019/6/12
 */
public class UserDao {


    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());


    public User login(User loginUser) {


        try {
            String sql = "select * from user where username=? and password =?";


            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername(), loginUser.getPassword());


            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;

        }

    }
}
