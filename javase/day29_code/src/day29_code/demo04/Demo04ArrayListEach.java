package day29_code.demo04;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo04ArrayListEach {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("迪丽热巴");
        list.add("古力拉扎");
        list.add("赵丽颖");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }


    }
}
