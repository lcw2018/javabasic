package com.lcw.test;

import com.lcw.dao.RoleDao;
import com.lcw.dao.UserDao;
import com.lcw.domain.Role;
import com.lcw.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by chuanwen.li on 2019/4/29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")

public class ManyToManyTest {


    /**
     * 保存一个用户，保存一个角色
     * <p>
     * 多对多放弃维护权：被动的一方放弃
     */
    @Autowired
    RoleDao roleDao;
    @Autowired
    UserDao userDao;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testAdd() {

        User user = new User();
        user.setUserName("科比");

        Role role = new Role();

        role.setRoleName("NBA球星");

        //配置用户到角色关系，可以对中间表中的数据进行维护     1-1
        user.getSet().add(role);

        //配置角色到用户关系，可以对中间表中的数据进行维护     1-1
        role.getSet().add(user);

        userDao.save(user);

        roleDao.save(role);


    }
    //测试级联添加（保存一个用户的同时保存用户的关联角色）


    @Test
    @Transactional
    @Rollback(value = false)
    public void testCascadeAdd() {


        User user = new User();
        user.setUserName("刘德华");

        Role role1 = new Role();

        role1.setRoleName("歌手");

        Role role2 = new Role();

        role2.setRoleName("影帝");
      //配置用户到角色关系，可以对中间表中的数据进行维护     1-1
        user.getSet().add(role1);
        //配置用户到角色关系，可以对中间表中的数据进行维护     1-1
        user.getSet().add(role2);
      //配置角色到用户关系，可以对中间表中的数据进行维护     1-1
        role1.getSet().add(user);

        //配置角色到用户关系，可以对中间表中的数据进行维护     1-1
        role2.getSet().add(user);

        userDao.save(user);


    }

    /**
     * 案例：删除id为1的用户，同时删除他的关联对象
     */
    @Test
    @Transactional
    @Rollback(value = false)
    public void testCascaedDelete() {

        // userDao.delete(2l);
        //查询1号用户
        User one = userDao.findOne(1l);
//        如果有查询操作，applicationcontext.xml文件中<prop key="hibernate.hbm2ddl.auto">update</prop>
        //org.springframework.dao.InvalidDataAccessApiUsageException: The entity must not be null!; nested exception is java.lang.IllegalArgumentException: The entity must not be null!
        //删除1号用户
        userDao.delete(one);
    }


}
