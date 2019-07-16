package com.lcw.demo06.ThreadSafe;

//实现买票案例


public class RunnableImpl implements Runnable {

   //定义一个多个线程共享的票源
    private int ticket = 100;

    @Override
    public void run() {

        while (true) {//死循环，持续卖票
            if (ticket > 0) {//还存在没有卖完的票
                try {//让线程进行休眠，增强线程安全问题的可能性
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
                ticket--;

            }

        }


    }
}
