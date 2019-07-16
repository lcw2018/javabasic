package com.lcw.demo07.Synchronized;
/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */

public class Demo01Ticket {

    public static void main(String[] args) {
        //创建Runnable类的实现类实例对象
        Runnable r = new RunnableImpl();
        //创建Thread类对象，构造函数传入Runnable类是实现对象
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        //调用start（）方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }


}
