package cn.lcw.day07.demo2;

public class MyRunnable implements Runnable {


    @Override
    public void run() {

        System.out.println("我需要一个教练!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来教我游泳了！" + Thread.currentThread().getName());
        System.out.println("教练教完我后，回到了游泳池");

    }
}
