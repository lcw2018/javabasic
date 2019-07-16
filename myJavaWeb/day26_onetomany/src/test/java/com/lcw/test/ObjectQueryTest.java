package com.lcw.test;

import com.lcw.dao.CustomerDao;
import com.lcw.dao.LinkManDao;
import com.lcw.domain.Customer;
import com.lcw.domain.LinkMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;
import java.util.Set;

/**
 * Create by chuanwen.li on 2019/4/29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class ObjectQueryTest {


    @Autowired
    CustomerDao customerDao;

    @Autowired
    LinkManDao linkManDao;

    @Test
    @Transactional //could not initialize proxy - no Session
    //@Rollback(value = false)
    //测试对象导航查询（查询一个对象的时候，通过此对象查询所有的关联对象）
    public void testQuert1() {

        Customer one = customerDao.findOne(1L);

        Set<LinkMan> set = one.getSet();

        for (LinkMan l :
                set) {
            System.out.println(l);
        }


    }

    /**
     * 对象导航查询：
     * 默认使用的是延迟加载的形式查询的
     * 调用get方法并不会立即发送查询，而是在使用关联对象的时候才会查询
     * 延迟加载！
     * 修改配置，将延迟加载改为立即加载
     * fetch，需要配置到多表映射关系的注解上
     */

    @Test
    @Transactional
    public void testQuery2() {
        //查询id为1的客户
        Customer one = customerDao.findOne(1L);
        //对象导航查询此客户下的所有联系人
        Set<LinkMan> set = one.getSet();

        System.out.println(set.size());

    }

    /**
     * 从联系人对象导航查询他的所属客户
     * * 默认 ： 立即加载
     * 延迟加载：
     */

    @Test
    @Transactional
    public void testQuery3() {
        LinkMan one = linkManDao.findOne(2l);
        Customer customer = one.getCustomer();
        System.out.println(customer);


    }
}
