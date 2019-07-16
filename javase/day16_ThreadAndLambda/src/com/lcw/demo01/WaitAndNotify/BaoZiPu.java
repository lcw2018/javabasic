package com.lcw.demo01.WaitAndNotify;

/*
    生产者(包子铺)类:是一个线程类,可以继承Thread
	设置线程任务(run):生产包子
	对包子的状态进行判断
	true:有包子
		包子铺调用wait方法进入等待状态
	false:没有包子
		包子铺生产包子
		增加一些趣味性:交替生产两种包子
			有两种状态(i%2==0)
		包子铺生产好了包子
		修改包子的状态为true有
		唤醒吃货线程,让吃货线程吃包子

	注意:
	    包子铺线程和吃货线程关系-->通信(互斥)
	    必须同时同步技术保证两个线程只能有一个在执行
	    锁对象必须保证唯一,可以使用包子对象作为锁对象
	    包子铺类和吃货的类就需要把包子对象作为参数传递进来
	        1.需要在成员位置创建一个包子变量
	        2.使用带参数构造方法,为这个包子变量赋值
 */
public class BaoZiPu extends Thread {

    //需要在成员位置创建一个包子变量
    private BaoZi bz;

    //使用带参数构造方法,为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }


 //	设置线程任务(run):生产包子
    @Override
    public void run() {

      //定义一个变量
        int count = 0;
      //死循环，持续生产包子
        while (true) {
            //必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
                //判断包子的状态
                if (bz.flag == true) {

                     //包子铺调用wait方法，进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
          //被唤醒后，生产包子，增加一些趣味，交替生产两种包子
                if (count % 2 == 0) {
                    //生产薄皮荠菜包子
                    bz.pi = "薄皮";
                    bz.xian = "荠菜";

                } else if (count % 2 == 1) {
                    //生产厚皮，肉馅包子
                    bz.pi = "厚皮";
                    bz.xian = "肉馅";


                }

                count++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "包子");
                try {
                    //生产包子需要3秒
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

              //包子生产好了，修改包子状态
                bz.notify();
                bz.flag = true;
             //通知吃货开始吃包子
                System.out.println(bz.pi + bz.xian + "饺子已经做好了,吃货可以吃饺子了");
                System.out.println("----------------------------------------");

            }


        }


    }
}
