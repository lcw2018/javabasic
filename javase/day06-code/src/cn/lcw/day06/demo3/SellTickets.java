package cn.lcw.day06.demo3;

public class SellTickets implements Runnable {
    //可以出售的总票数
    private int ticket = 100;


    @Override
    public void run() {
        //每个窗口买票的操作
        //卖票窗口永远开启

        while (true) {
            if (ticket > 0) {//如果有票就继续卖

                try {
                    //模拟一下出票时间
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在出售:" + ticket--);

            }

        }
    }
}
