package com.lcw.demo03.Lambda;

//使用实现Runnable接口的方式，实现多线程
public class Demo01Runnable {
    public static void main(String[] args) {

        //创建Runnable类的实现类对象
        Runnable run = new RunnableImpl();
        //使用Thread类创建线程，构造方法传入Runnable类的实现类对象
        Thread t = new Thread(run);
         //调用start方法，开启线程
        t.start();

        //简化代码,使用匿名内部类实现多线程程序
        Runnable r = new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + "新的线程创建了");

            }
        };
        new Thread(r).start();

        //简化代码

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        }).start();


    }


}
