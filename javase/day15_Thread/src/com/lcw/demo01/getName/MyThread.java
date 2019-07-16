package com.lcw.demo01.getName;


/*
    获取线程的名称:
        1.使用Thread类中的方法getName()
            String getName() 返回该线程的名称。
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
//创建Thread子类的实例
public class MyThread extends Thread {

    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        String name1 = thread.getName();
        System.out.println(name1);

    }
}
