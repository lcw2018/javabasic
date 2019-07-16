package day33_code.demo08;

import day33_code.red.OpenMode;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/7/3
 */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {


        ArrayList<Integer> list = new ArrayList<>();


        int avg = totalMoney / totalCount;  //平均数


        int mod = totalMoney % totalCount;   //余数，取模

        // 注意totalCount - 1代表，最后一个先留着
        for (int i = 0; i < totalCount - 1; i++) {

            list.add(avg);
        }

       // 有零头，需要放在最后一个红包当中
        int last = avg + mod;


        list.add(last);


        return list;

    }
}
