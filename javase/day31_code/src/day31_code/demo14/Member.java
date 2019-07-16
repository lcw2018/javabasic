package day31_code.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * Create by chuanwen.li on 2019/7/1
 */

//普通成员
public class Member extends User {


    public Member() {


    }

    public Member(String name, int money) {
        super(name, money);
    }


    public void recive(ArrayList<Integer> arrayList) {

         // 从多个红包当中随便抽取一个，给我自己。
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(arrayList.size());

        // 根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int del= arrayList.remove(index);

        // 当前成员自己本来有多少钱：
        int money = super.getMoney();

        // 加法，并且重新设置回去
        super.setMoney(del + money);


    }


}
