package com.lcw.test;

import com.lcw.dao.CustomerDao;
import com.lcw.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/28
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class CustomerDaoTest {

    @Autowired
    CustomerDao customerDao;

    /**
     * 保存用户，调用save(object)方法
     */
    /**
     * save : 保存或者更新
     * 根据传递的对象是否存在主键id，
     * 如果没有id主键属性：保存
     * 存在id主键属性，根据id查询数据，更新数据
     */
    @Test
    public void testSave() {

        Customer c = new Customer();
        c.setCustName("八斗学院");
        c.setCustIndustry("AI");
        c.setCustLevel("vip在线");
        c.setCustSource("互联网");
        c.setCustAddress("北京市");
        c.setCustPhone("10086");

        customerDao.save(c);


    }

    /**
     * 修改客户：调用save(obj)方法
     * 对于save方法的解释：如果执行此方法是对象中存在id属性，即为更新操作会先根据id查询，再更新
     * 如果执行此方法中对象中不存在id属性，即为保存操作
     */

    @Test
    public void testUpdate1() {

        Customer c = new Customer();
        c.setCustId(10l);//自动增长，id还是7，不是10,
        c.setCustName("腾讯课堂");
        customerDao.save(c);

    }


    @Test
    public void testUpdate() {
        Customer c = customerDao.findOne(5l);
        c.setCustAddress("海景花园");

        customerDao.save(c);


    }

    /**
     * 根据id删除：调用delete(id)方法
     */
    @Test
    public void testDelete() {


        customerDao.delete(2l);

    }

    /**
     * 根据id查询：调用findOne(id)方法
     */

    @Test
    public void testFindById() {

        Customer customer = customerDao.findOne(5L);

        System.out.println(customer);


    }


    /**
     * 查询所有
     */
    @Test
    public void testFindAll() {

        List<Customer> all = customerDao.findAll();
        for (Customer c :
                all) {
            System.out.println(c);
        }

    }

    /**
     * 测试统计查询：查询客户的总数量
     * count:统计总条数
     */

    @Test
    public void testCount() {

        long count = customerDao.count();
        System.out.println(count);


    }


    /**
     * 测试：判断id为4的客户是否存在
     * 1. 可以查询一下id为4的客户
     * 如果值为空，代表不存在，如果不为空，代表存在
     * 2. 判断数据库中id为4的客户的数量
     * 如果数量为0，代表不存在，如果大于0，代表存在
     */
    @Test
    public void testExist() {
        //Hibernate: select count(*) as col_0_0_ from cust_customer customer0_ where customer0_.cust_id=? and 1=1
        boolean exists = customerDao.exists(4l);
        System.out.println(exists);


    }

    /**
     * 根据id从数据库查询
     *
     * @Transactional : 保证getOne正常运行
     * <p>
     * findOne：
     * em.find()           :立即加载
     * getOne：
     * em.getReference     :延迟加载
     * * 返回的是一个客户的动态代理对象
     * * 什么时候用，什么时候查询
     */

    @Transactional//如果不加此注解的话，会报错
    //org.hibernate.LazyInitializationException: could not initialize proxy - no Session
    @Test
    public void testGetOne() {


        Customer one = customerDao.getOne(4l);

        System.out.println(one);


    }


}
