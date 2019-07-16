package day31_code.demo14;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/7/1
 */
public class MainRedPacket {


    public static void main(String[] args) {

        Manager manager = new Manager("经理", 100);

        Member member1 = new Member("员工A", 0);
        Member member2 = new Member("员工B", 0);
        Member member3 = new Member("员工C", 0);

        manager.show(); //100
        member1.show();  //0
        member2.show();  //0
        member3.show();  //0

        System.out.println("=======================================");

        // 群主总共发20块钱，分成3个红包
        ArrayList<Integer> list = manager.send(20, 3);

        // 三个普通成员收红包
        member1.recive(list);
        member2.recive(list);
        member3.recive(list);


        manager.show();// 100-20=80
        // 6、6、8，随机分给三个人
        member1.show();
        member2.show();
        member3.show();


    }

}
