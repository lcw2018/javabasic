package com.lcw.test;

import com.lcw.dao.UserDao;
import com.lcw.domain.User;
import org.junit.Test;

/**
 * Create by chuanwen.li on 2019/6/13
 */
public class UserDaoTest {


    @Test
    public void testLogin() {


        User user = new User();

        user.setUsername("kobe");
        user.setPassword("12");

        UserDao userDao = new UserDao();

        User login = userDao.login(user);

        System.out.println(login);


    }


}
