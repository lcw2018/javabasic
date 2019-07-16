package com.lcw.service.impl;

import com.lcw.dao.UserDao;
import com.lcw.dao.impl.UserDaoImpl;
import com.lcw.domain.User;
import com.lcw.service.UserService;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/6/5
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
