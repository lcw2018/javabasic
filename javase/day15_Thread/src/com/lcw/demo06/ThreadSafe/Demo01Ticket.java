package com.lcw.demo06.ThreadSafe;
/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */
public class Demo01Ticket {

    public static void main(String[] args) {
       //创建Runnable接口实现类的实例
        RunnableImpl r = new RunnableImpl();
        //创建Thread对象，构造方法中传入Runnable实现类的对象实例
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        //使用start（）方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }


}
