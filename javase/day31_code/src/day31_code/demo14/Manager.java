package day31_code.demo14;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/7/1
 */
//群主的类
public class Manager extends User {


    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }


    public ArrayList<Integer> send(int total, int count) {

        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();

        // 首先看一下群主自己有多少钱
        int leafMoney = super.getMoney();

        if (total > leafMoney) {

            System.out.println("余额不足！");
            return list;   // 返回空集合

        }


        int money = leafMoney - total;
        // 扣钱，其实就是重新设置余额
        super.setMoney(money);

        // 发红包需要平均拆分成为count份
        int avg = total / count;
        int mod = total % count;  // 余数，也就是甩下的零头

        // 除不开的零头，包在最后一个红包当中
        // 下面把红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {

            list.add(avg);

        }


        // 最后一个红包
        int lastMoney = avg + mod;

        list.add(lastMoney);


        return list;
    }


}
