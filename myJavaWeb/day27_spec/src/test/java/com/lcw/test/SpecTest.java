package com.lcw.test;

import com.lcw.dao.CustomerDao;
import com.lcw.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/28
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class SpecTest {

    //根据条件查询单个对象
    @Autowired
    CustomerDao customerDao;

    @Test
    public void testSpec1() {
        //匿名内部类
        /**
         * 自定义查询条件
         *      1.实现Specification接口（提供泛型：查询的对象类型）
         *      2.实现toPredicate方法（构造查询条件）
         *      3.需要借助方法参数中的两个参数（
         *          root：获取需要查询的对象属性
         *          CriteriaBuilder：构造查询条件的，内部封装了很多的查询条件（模糊匹配，精准匹配）
         *       ）
         *  案例：根据客户名称查询，查询客户名为传智播客的客户
         *          查询条件
         *              1.查询方式
         *                  cb对象
         *              2.比较的属性名称
         *                  root对象
         *
         */


        Specification<Customer> specification = new Specification<Customer>() {
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                //1.获取比较的属性
                Path<Object> custName = root.get("custName");
                //2.构造查询条件  ：    select * from cst_customer where cust_name = '传智播客'
                /**
                 * 第一个参数：需要比较的属性（path对象）
                 * 第二个参数：当前需要比较的取值
                 */
                Predicate predicate = criteriaBuilder.equal(custName, "黑马程序员");//进行精准的匹配  （比较的属性，比较的属性的取值）


                return predicate;
            }
        };

        Customer one = customerDao.findOne(specification);

        System.out.println(one);


    }

    /**
     * 多条件查询
     * 案例：根据客户名（传智播客）和客户所属行业查询（it教育）
     */
    @Test
    public void testSpec2() {
        /**
         *  root:获取属性
         *      客户名
         *      所属行业
         *  cb：构造查询
         *      1.构造客户名的精准匹配查询
         *      2.构造所属行业的精准匹配查询
         *      3.将以上两个查询联系起来
         */

        Specification<Customer> specification = new Specification<Customer>() {
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path<Object> path1 = root.get("custName");
                Path<Object> path2 = root.get("custIndustry");

                //构造查询
                //1.构造客户名的精准匹配查询
                Predicate predicate1 = criteriaBuilder.equal(path1, "八斗学院");

                //2..构造所属行业的精准匹配查询
                Predicate predicate2 = criteriaBuilder.equal(path2, "AI");
                //3.将多个查询条件组合到一起：组合（满足条件一并且满足条件二：与关系，满足条件一或满足条件二即可：或关系）
                Predicate predicate = criteriaBuilder.and(predicate1, predicate2);////以与的形式拼接多个查询条件
                // cb.or();//以或的形式拼接多个查询条件

                return predicate;
            }
        };

        Customer one = customerDao.findOne(specification);
        System.out.println(one);


    }

    /**
     * 案例：完成根据客户名称的模糊匹配，返回客户列表
     * 客户名称以 ’传智播客‘ 开头
     * <p>
     * equal ：直接得到path对象（属性），然后进行比较即可
     * gt，lt,ge,le,like : 得到path对象，根据path指定比较的参数类型，再去进行比较
     * 指定参数类型：path.as(类型的字节码对象)
     */
    @Test
    public void testSpec3() {

        Specification<Customer> specification = new Specification<Customer>() {
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path<Object> path = root.get("custName");

                Predicate predicate = criteriaBuilder.like(path.as(String.class), "%学院");


                return predicate;
            }
        };


      /*  List<Customer> all = customerDao.findAll(specification);
        for (Customer c :
                all) {
            System.out.println(c);
        }*/
        //添加排序
        //创建排序对象,需要调用构造方法实例化sort对象
        //第一个参数：排序的顺序（倒序，正序）
        //   Sort.Direction.DESC:倒序
        //   Sort.Direction.ASC ： 升序
        //第二个参数：排序的属性名称

        Sort sort = new Sort(Sort.Direction.DESC, "custId");
        List<Customer> all = customerDao.findAll(specification, sort);
        for (Customer c :
                all) {
            System.out.println(c);
        }

    }

    //分页查询
    @Test
    public void testSpec4() {
        //PageRequest对象是Pageable接口的实现类
        /**
         * 创建PageRequest的过程中，需要调用他的构造方法传入两个参数
         *      第一个参数：当前查询的页数（从0开始）
         *      第二个参数：每页查询的数量
         */

        Pageable pageable = new PageRequest(0, 2);

        Page<Customer> all = customerDao.findAll(null, pageable);
        System.out.println(all.getContent());//得到数据集合列表
        //[Customer{custId=4, custName='北风网', custSource='网上', custLevel='VIP学习', custIndustry='互联网', custPhone='18772305906', custAddress='广东省南山区华侨城海景花园小区'}, Customer{custId=5, custName='黑马程序员', custSource='网上', custLevel='在线教育', custIndustry='IT', custPhone='18772305906', custAddress='海景花园'}]
        System.out.println(all.getTotalElements());//得到总条数 5
        System.out.println(all.getTotalPages());//得到总页数 3
        for (Customer c :
                all) {
            System.out.println(c);
        }

    }


}
