package com.lcw.demo09.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第三种方案:使用Lock锁
    java.util.concurrent.locks.Lock接口
    Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
    Lock接口中的方法:
        void lock()获取锁。
        void unlock()  释放锁。
    java.util.concurrent.locks.ReentrantLock implements Lock接口


    使用步骤:
        1.在成员位置创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
        3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
 */
public class RunnableImpl implements Runnable {

//多个线程共享的票源
    private int ticket = 100;
    // 1.在成员位置创建一个ReentrantLock对象
    Lock lock = new ReentrantLock();

/*      //设置线程任务:卖票
    @Override
    public void run() {
        while (true) {
           //2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            lock.lock();
            if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "第" + ticket + "张票正在出售");
                ticket--;
            }
           // 3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
            lock.unlock();
        }

    } */

//设置线程任务：卖票

@Override
    public void run() {
        while (true) {
           //    2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            lock.lock();
            if (ticket > 0) {

                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "第" + ticket + "张票正在出售");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();//3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    //无论程序是否抛出异常，都会执行的语句
                }

            }

        }

    }
}
