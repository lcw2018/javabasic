package com.lcw.test;

import com.lcw.domain.Customer;
import com.lcw.utils.JpaUtils;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Create by chuanwen.li on 2019/4/26
 */
public class JpaTest {


    /**
     * 测试jpa的保存
     * 案例：保存一个客户到数据库中
     * Jpa的操作步骤
     * 1.加载配置文件创建工厂（实体管理器工厂）对象
     * 2.通过实体管理器工厂获取实体管理器
     * 3.获取事务对象，开启事务
     * 4.完成增删改查操作
     * 5.提交事务（回滚事务）
     * 6.释放资源
     */
    @Test
    public void Test() {
        /**
         * 创建实体管理类工厂，借助Persistence的静态方法获取
         * 		其中传递的参数为持久化单元名称，需要jpa配置文件中指定
         */

        // 加载配置文件创建工厂（实体管理器工厂）对象
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");


        // 通过实体管理器工厂获取实体管理器
        EntityManager em = factory.createEntityManager();
        //获取事务对象
        EntityTransaction tx = em.getTransaction();

        Customer c = new Customer();
        c.setCustName("蚂蚁课堂");
        //开启事务
        tx.begin();
        //保存操作
        em.persist(c);

        //提交事务
        tx.commit();
        //释放资源
        em.close();
        factory.close();


    }
    //保存操作

    @Test
    public void testSave() {

        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            //获取实体管理对象
            em = JpaUtils.getEntityManager();
            Customer c = new Customer();
            c.setCustName("黑马程序员");
            c.setCustIndustry("IT");
            c.setCustLevel("在线教育");
            c.setCustSource("网上");
            c.setCustPhone("18772305906");
            c.setCustAddress("广东省南山区华侨城海景花园小区");

            //获取事务
            tx = em.getTransaction();

            //开启事务
            tx.begin();

            //保存操作
            em.persist(c);

            //提交事务
            tx.commit();
        } catch (Exception e) {

            e.printStackTrace();
            //回滚事务
            tx.rollback();


        } finally {
            //释放资源
            em.close();
        }


    }

    //更新操作
    @Test
    public void testUpdate() {

        EntityManager em = null;

        EntityTransaction tx = null;


        try {
            em = JpaUtils.getEntityManager();

            tx = em.getTransaction();

            tx.begin();

            Customer c = em.find(Customer.class, 1L);

            c.setCustName("蚂蚁课堂");

            em.clear();
            em.merge(c);

            tx.commit();
            System.out.println(c);

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();

        } finally {
            em.close();
        }


    }
    //删除

    @Test
    public void testRemove() {

        EntityManager em = null;

        EntityTransaction tx = null;

        try {
            em = JpaUtils.getEntityManager();

            tx = em.getTransaction();

            tx.begin();

            Customer c = em.find(Customer.class, 1L);

            em.remove(c);

            tx.commit();


        } catch (Exception e) {

            e.printStackTrace();
            tx.rollback();

        } finally {

            em.close();

        }


    }


    //根据ID查询
 /*   @Test
    public void testGetOne() {

        EntityManager em = null;

        EntityTransaction tx = null;


        try {
            em = JpaUtils.getEntityManager();

            tx = em.getTransaction();

            tx.begin();


            Customer c = em.find(Customer.class, 2l);

            tx.commit();

            System.out.println(c);


        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();


        } finally {
            em.close();

        }


    }*/


    /**
     * 根据id查询客户
     *  使用find方法查询：
     *      1.查询的对象就是当前客户对象本身
     *      2.在调用find方法的时候，就会发送sql语句查询数据库
     *
     *  立即加载
     *
     *
     */
    //根据ID查询
    //查询实体的缓存问题
    @Test
    public void testGetOne() {

        EntityManager em = null;

        EntityTransaction tx = null;


        try {
            em = JpaUtils.getEntityManager();

            tx = em.getTransaction();

            tx.begin();


            Customer c1 = em.find(Customer.class, 2l);
          //  Customer c2 = em.find(Customer.class, 2l);
          //  System.out.println(c1 == c2);//true输出结果是true，EntityManager也有缓存
            tx.commit();


         //   System.out.println(c1 == c2);//true 输出结果是true，EntityManager也有缓存
            System.out.println(c1);

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();


        } finally {
            em.close();

        }


    }
    /**
     * 根据id查询客户
     *      getReference方法
     *          1.获取的对象是一个动态代理对象
     *          2.调用getReference方法不会立即发送sql语句查询数据库
     *              * 当调用查询结果对象的时候，才会发送查询的sql语句：什么时候用，什么时候发送sql语句查询数据库
     *
     * 延迟加载（懒加载）
     *      * 得到的是一个动态代理对象
     *      * 什么时候用，什么使用才会查询
     */

    //使用延迟加载查询
    @Test
    public void testLoadOne() {


        EntityManager em = null;

        EntityTransaction tx = null;
        try {

            em = JpaUtils.getEntityManager();

            tx = em.getTransaction();

            tx.begin();


            Customer c = em.getReference(Customer.class, 3l);

            tx.commit();


            System.out.println(c);


        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();

        } finally {
            em.close();

        }

    }


}
