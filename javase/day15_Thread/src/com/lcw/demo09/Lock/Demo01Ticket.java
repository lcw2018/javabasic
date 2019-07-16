package com.lcw.demo09.Lock;

/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */


public class Demo01Ticket {

    public static void main(String[] args) {
        //创建Runnable类的实现类对象
        RunnableImpl r = new RunnableImpl();
        //创建多线程，构造函数中传入Runnable的实现类对象
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        //使用start方法开启线程
        t1.start();
        t2.start();
        t3.start();
    }

}
