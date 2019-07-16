package com.lcw.demo08.Synchronized;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的二种方案:使用同步方法
    使用步骤:
        1.把访问了共享数据的代码抽取出来,放到一个方法中
        2.在方法上添加synchronized修饰符

    格式:定义方法的格式
    修饰符 synchronized 返回值类型 方法名(参数列表){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private static int ticket = 100;
    Object object=new Object();

    @Override
    public void run() {

        System.out.println("this:" + this);//com.lcw.demo08.Synchronized.RunnableImpl@6353e1b2
        //使用死循环，让卖票动作重复进行
        while (true) {
            //  payTicketStatic();
            payTicket();
        }

    }
    /*
          定义一个同步方法
          同步方法也会把方法内部的代码锁住
          只让一个线程执行
          同步方法的锁对象是谁?
          就是实现类对象 new RunnableImpl()
          也是就是this
       */
    private /*synchronized*/ void payTicket() {
        synchronized (this) {
            //是否还有票可以出售
            if (ticket > 0) {
                try {
                    //提高安全问题出现的概率，让线程睡眠
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //卖票，并让余票减少1
                System.out.println(Thread.currentThread().getName() + "第" + ticket + "张票正在出售");
                ticket--;
            }
        }

    }
 /*
        静态的同步方法
        锁对象是谁?
        不能是this
        this是创建对象之后产生的,静态方法优先于对象
        静态方法的锁对象是本类的class属性-->class文件对象(反射)
     */

    private static /*synchronized */void payTicketStatic() {
        synchronized (Runnable.class) {
            //是否还有票可出售
            if (ticket > 0) {
                try {
                    //让线程睡眠，提高线程安全问题出现的概率
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //售票，并让余票的数目减少1
                System.out.println(Thread.currentThread().getName() + "第" + ticket + "张票正在出售");
                ticket--;
            }
        }

    }


}
