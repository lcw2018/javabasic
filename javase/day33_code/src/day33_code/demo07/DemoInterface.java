package day33_code.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by chuanwen.li on 2019/7/3
 */

/*
java.util.List正是ArrayList所实现的接口。
 */
public class DemoInterface {


    public static void main(String[] args) {

        //左边是接口名称，右边是实现类名称，是多态的写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);

        for (int i = 0; i < result.size(); i++) {

            System.out.println(result.get(i));

        }


    }

    private static List<String> addNames(List<String> list) {

        list.add("迪丽热巴");
        list.add("古力拉扎");
        list.add("赵丽颖");
        list.add("景甜");

        return list;
    }


}
