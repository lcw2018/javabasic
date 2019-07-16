package cn.lcw.day06.demo6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {


    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖：" + ticket--);

            }
            lock.unlock();

        }

    }
}
