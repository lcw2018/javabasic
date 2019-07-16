package com.lcw.test;

import com.lcw.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/26
 */
public class JpqlTest {

    //查询所有
    @Test
    public void findAll() {

        EntityManager em = null;

        EntityTransaction tx = null;

        try {


           //获取实体管理对象
            em = JpaUtils.getEntityManager();
          //获取事务对象
            tx = em.getTransaction();
            //开启事务
            tx.begin();

             //创建Query对象
            String sql = "from Customer ";
            Query query = em.createQuery(sql);

            //查询并放回结果
            List resultList = query.getResultList();

            for (Object o :
                    resultList) {
                System.out.println(o);

            }

            //提交事务
            tx.commit();


        } catch (Exception e) {

            e.printStackTrace();

            //回滚
            tx.rollback();


        } finally {

            //释放资源
            em.close();

        }


    }


    //分页查询

    @Test
    public void findPaged() {

        EntityManager em = null;

        EntityTransaction tx = null;


        try {

            //获取实体管理对象
            em = JpaUtils.getEntityManager();

           //获取事务对象
            tx = em.getTransaction();

            //开启事务
            tx.begin();

            //创建Query对象
            String sql = "from Customer ";

            Query query = em.createQuery(sql);
            //起始索引
            query.setFirstResult(0);

            //每页显示的条数
            query.setMaxResults(4);

            List resultList = query.getResultList();

            for (Object o :
                    resultList) {
                System.out.println(o);
            }

            tx.commit();


        } catch (Exception e) {


            e.printStackTrace();

            //回滚
            tx.rollback();

        } finally {
         //释放资源
            em.close();


        }


    }

    //条件查询

    @Test
    public void findCondition() {

        EntityManager em = null;


        EntityTransaction tx = null;


        try {


            //获取实体管理对象
            em = JpaUtils.getEntityManager();


            //获取事务对象
            tx = em.getTransaction();

            //开启事务
            tx.begin();

            //创建Query对象
            String sql = "from Customer where custName like ?";

            Query query = em.createQuery(sql);
            //对占位符赋值，从1开始
            query.setParameter(1, "%传智%");
            //得到唯一的结果集
            Object singleResult = query.getSingleResult();

            System.out.println(singleResult);

            //提交事务
            tx.commit();

        } catch (Exception e) {

            e.printStackTrace();

            //回滚对象
            tx.rollback();


        } finally {


            //释放资源
            em.close();
        }


    }


    @Test
    //排序查询
    public void testOrder() {

        EntityManager em = null;

        EntityTransaction tx = null;


        try {


            //获取实体管理对象
            em = JpaUtils.getEntityManager();


            //获取事务对象
            tx = em.getTransaction();

            //开启事务
            tx.begin();

            //创建Query对象
            String sql = " from  Customer  order by  custId desc ";

            Query query = em.createQuery(sql);


            List resultList = query.getResultList();
            for (Object o :
                    resultList) {
                System.out.println(o);

            }

            //提交事务
            tx.commit();


        } catch (Exception e) {

            e.printStackTrace();
            //回滚
            tx.rollback();


        } finally {

            //释放资源
            em.close();

        }


    }


    //统计查询
    @Test
    public void testCount() {

        EntityManager em = null;

        EntityTransaction tx = null;


        try {

            //获取实体管理对象
            em = JpaUtils.getEntityManager();

            //获取事务对象
            tx = em.getTransaction();

            //开启事务
            tx.begin();


            //创建Query对象
            String sql = "SELECT COUNT (custId) from Customer ";

            Query query = em.createQuery(sql);

            //获取结果
            Object singleResult = query.getSingleResult();

            System.out.println(singleResult);

            //提交事务
            tx.commit();


        } catch (Exception e) {

            e.printStackTrace();
             //回滚
            tx.rollback();


        } finally {

            //释放资源
            em.close();

        }


    }


}
