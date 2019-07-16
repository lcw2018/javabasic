package cn.lcw.day07.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {


    public static void main(String[] args) {

        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(3);

        //创建Runnable实例对象
        MyRunnable r = new MyRunnable();


        //从线程池中取出线程对象，然后调用Runnable中的run方法
        service.submit(r);
        service.submit(r);
        service.submit(r);
        //注意：submit方法调用完毕后，程序并没有终止，是因为线程池控制了线程的关闭

        //将用完的线程又归还到线程池中
        //关闭线程池

       // service.shutdown();


    }


}
