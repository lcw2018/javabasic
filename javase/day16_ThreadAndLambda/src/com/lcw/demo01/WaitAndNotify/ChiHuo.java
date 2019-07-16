package com.lcw.demo01.WaitAndNotify;

/*
    消费者(吃货)类:是一个线程类,可以继承Thread
	设置线程任务(run):吃包子
	对包子的状态进行判断
	false:没有包子
		吃货调用wait方法进入等待状态
	true:有包子
		吃货吃包子
		吃货吃完包子
		修改包子的状态为false没有
		吃货唤醒包子铺线程,生产包子
 */
public class ChiHuo extends Thread {
   //在成员位置定义包子对象
    private BaoZi bz;
   //使用带参数构造方法,为这个包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;

    }

     //设置线程任务，吃包子
    @Override
    public void run() {
        //设置死循环，持续吃包子
        while (true) {
            //必须使用同步技术保证两个线程只有一个在执行
            synchronized (bz) {
                //判断包子的状态
                if (bz.flag == false) {
                    try {
                        //调用wait方法，进入等待状态
                       bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                //被唤醒时，开始吃包子
                    System.out.println("吃货开始吃：" + bz.pi + bz.xian + "包子");
               //吃完包子，修改包子状态，

                    bz.flag = false;
                    bz.notify();
                    //唤醒包子铺线程，让包子铺，生产包子
                System.out.println("吃货已经把"+bz.pi+bz.xian+"吃完，包子铺请开始做包子");
                System.out.println("--------------------------------------------------");

            }

        }


    }
}
