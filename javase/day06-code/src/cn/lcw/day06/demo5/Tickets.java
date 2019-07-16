package cn.lcw.day06.demo5;

import javax.jws.soap.SOAPBinding;

public class Tickets implements Runnable {

    private int ticket = 100;


    @Override
    public void run() {
        while (true) {

            setTicket();


        }

    }
        public synchronized void setTicket () {


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