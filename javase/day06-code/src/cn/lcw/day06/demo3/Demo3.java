package cn.lcw.day06.demo3;

public class Demo3 {

    public static void main(String[] args) {
        //创建窗口任务对象
        SellTickets sellTickets = new SellTickets();

        //开启三个窗口卖票
        Thread t1 = new Thread(sellTickets, "窗口1");
        Thread t2 = new Thread(sellTickets, "窗口2");
        Thread t3 = new Thread(sellTickets, "窗口3");

        t1.start();
        t2.start();
        t3.start();


    }


}
