package com.lcw.dao.impl;

import com.lcw.dao.UserDao;
import com.lcw.domain.User;
import com.lcw.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/6/5
 */
public class UserDaoImpl implements UserDao {


    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {

        String sql = "select * from user ";

        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }
}
