package com.lcw.test;

import com.lcw.dao.CustomerDao;
import com.lcw.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/28
 */

@RunWith(SpringJUnit4ClassRunner.class)//声明spring容器的单元测试环境
@ContextConfiguration(locations = "classpath:applicationcontext.xml")//声明spring容器的配置信息
public class JpqlTest {

    @Autowired
    CustomerDao customerDao;

    @Test
    public void testFindJpql() {

        Customer c = customerDao.findJpql("八斗学院");

        System.out.println(c);

    }

    @Test
    public void testFindByCustNameAndId() {

        Customer c = customerDao.findByCustNameAndId("传智播客", 4l);

        System.out.println(c);

    }


    /**
     * 测试jpql的更新操作
     * * springDataJpa中使用jpql完成 更新/删除操作
     * * 需要手动添加事务的支持
     * * 默认会执行结束之后，回滚事务
     *
     * @Rollback : 设置是否自动回滚
     * false | true
     */

    @Rollback(value = false)
    @Transactional  //添加事务支持
    @Test
    public void testUpdateCustomer() {

        customerDao.updateCustomer(4l, "北风网");


    }

    //Object[]
    @Test
    public void testFindSql() {  //测试sql查询

        List<Object[]> list = customerDao.findSql();

        for (Object[] o :
                list) {
            System.out.println(Arrays.toString(o));//将数组对象转换成字符串
        }


    }

    //测试方法命名规则查询
    @Test
    public void testFindByCustName() {

        Customer c = customerDao.findByCustName("八斗学院");

        System.out.println(c);

    }

    //测试方法命名规则查询

    @Test
    public void testFindByCustNameLike() {

        List<Customer> list = customerDao.findByCustNameLike("%堂");
        for (Customer c :
                list) {
            System.out.println(c);
        }


    }

    //测试方法命名规则查询
    @Test
    public void testFindByCustNameLikeAndCustId() {

        Customer c = customerDao.findByCustNameLikeAndCustId("%院", 1l);
        System.out.println(c);

    }


}
