package cn.lcw.day07;

public class ChiHuo extends Thread {

    private BaoZi bz;


    public ChiHuo(String name, BaoZi bz) {
        super(name);

        this.bz = bz;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {//包子铺的包子卖完了，没有包子了

                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("吃货正在吃" + bz.pier + bz.xianer + "包子");
                bz.flag = false;
                bz.notify();


            }
        }

    }
}
