package com.lcw.demo03.Lambda;

//实现Runnable接口，重写run方法，设置线程任务
public class RunnableImpl implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程创建了");


    }
}
