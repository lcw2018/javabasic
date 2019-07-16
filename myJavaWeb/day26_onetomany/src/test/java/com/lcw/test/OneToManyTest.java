package com.lcw.test;


import com.lcw.dao.CustomerDao;
import com.lcw.dao.LinkManDao;
import com.lcw.domain.Customer;
import com.lcw.domain.LinkMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;

/**
 * Create by chuanwen.li on 2019/4/29
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class OneToManyTest {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    LinkManDao linkManDao;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testAdd() {

        /**
         * 保存一个客户，保存一个联系人
         *  效果：客户和联系人作为独立的数据保存到数据库中
         *      联系人的外键为空
         *  原因？
         *      实体类中没有配置关系
         */
        Customer customer = new Customer();
        customer.setCustName("达内科技");
        customer.setCustIndustry("IT培训");
        customer.setCustAddress("武汉");
        customer.setCustLevel("面授");
        customer.setCustPhone("18611111111");


        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("小雪");
        linkMan.setLkmGender("女");
        /**
         * 配置了客户到联系人的关系
         *      从客户的角度上：发送两条insert语句，发送一条更新语句更新数据库（更新外键）
         * 由于我们配置了客户到联系人的关系：客户可以对外键进行维护
         */
        customer.getSet().add(linkMan);

        customerDao.save(customer);
        linkManDao.save(linkMan);

    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void testAdd1() {

        Customer customer = new Customer();
        customer.setCustName("达内科技");
        customer.setCustIndustry("IT培训");
        customer.setCustAddress("武汉");
        customer.setCustLevel("面授");
        customer.setCustPhone("18611111111");


        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("小雪");
        linkMan.setLkmGender("女");
        /**
         * 配置联系人到客户的关系（多对一）
         *    只发送了两条insert语句
         * 由于配置了联系人到客户的映射关系（多对一）
         *
         *
         */
        linkMan.setCustomer(customer);

        customerDao.save(customer);
        linkManDao.save(linkMan);

    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void testAdd2() {

        Customer customer = new Customer();
        customer.setCustName("达内科技");
        customer.setCustIndustry("IT培训");
        customer.setCustAddress("武汉");
        customer.setCustLevel("面授");
        customer.setCustPhone("18611111111");


        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("小雪");
        linkMan.setLkmGender("女");
        /**
         * 会有一条多余的update语句
         *      * 由于一的一方可以维护外键：会发送update语句
         *      * 解决此问题：只需要在一的一方放弃维护权即可
         *
         */

        customer.getSet().add(linkMan);//由于配置了一的一方到多的一方的关联关系（发送一条update语句）
        linkMan.setCustomer(customer);//由于配置了多的一方到一的一方的关联关系（当保存的时候，就已经对外键赋值）

        customerDao.save(customer);
        linkManDao.save(linkMan);

    }

    /**
     * 级联添加：保存一个客户的同时，保存客户的所有联系人
     * 需要在操作主体的实体类上，配置casacde属性
     */

    @Test
    @Transactional
    @Rollback(value = false)
    public void testCascadeAdd() {
        Customer customer = new Customer();
        customer.setCustName("传智播客");
        customer.setCustAddress("北京");

        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkmName("刘德华");
        LinkMan linkMan2 = new LinkMan();
        linkMan2.setLkmName("成龙");

        customer.getSet().add(linkMan1);
        customer.getSet().add(linkMan2);

        linkMan1.setCustomer(customer);
        linkMan2.setCustomer(customer);
        customerDao.save(customer);


    }

    /**
     * 级联删除：
     * 删除1号客户的同时，删除1号客户的所有联系人
     */

    @Test
    @Transactional
    @Rollback(value = false)
    public void testCascadeDetele() {

        Customer one = customerDao.findOne(1l);

        customerDao.delete(one);


    }


}
