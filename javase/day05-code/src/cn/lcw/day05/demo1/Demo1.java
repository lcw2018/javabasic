package cn.lcw.day05.demo1;

public class Demo1 {

    public static void main(String[] args) {
        //创建自定义线程对象
        MyThread myThread = new MyThread("新的线程！");
        //开启线程
        myThread.start();

        //在主线程中执行循环
        for (int i = 0; i < 1000; i++) {
            System.out.println("mainThread:" + i);
        }


    }


}
