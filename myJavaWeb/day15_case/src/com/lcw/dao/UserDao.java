package com.lcw.dao;

import com.lcw.domain.User;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/6/5
 */
public interface UserDao {

    public List<User> findAll();

}
