package com.lcw.demo02.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread myThread = new MyThread();

        myThread.setName("小强");
        myThread.start();

        //开启多线程
        new MyThread("旺财").start();


    }


}
