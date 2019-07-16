package cn.lcw.day06.demo5;

import cn.lcw.day06.demo4.Ticket;

public class Demo5 {
    public static void main(String[] args) {
        Tickets ts = new Tickets();


        Thread t1 = new Thread(ts, "窗口1");

        Thread t2 = new Thread(ts, "窗口2");

        Thread t3 = new Thread(ts, "窗口3");

        t1.start();
        t2.start();
        t3.start();


    }


}
