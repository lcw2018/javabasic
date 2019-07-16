package cn.lcw.day06.demo4;

public class Ticket implements Runnable {


    private int ticket = 100;


    @Override
    public void run() {

        while (true) {

            synchronized (this) {//同步代码块解决线程安全问题
                if (ticket > 0) {


                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖：" + ticket--);

                }
            }


        }


    }
}
