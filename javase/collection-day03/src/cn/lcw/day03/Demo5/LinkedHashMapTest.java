package cn.lcw.day03.Demo5;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {


    public static void main(String[] args) {


        LinkedHashMap<Student, String> map = new LinkedHashMap<>();

        map.put(new Student("李晨", 23), "北京");
        map.put(new Student("刘亦菲", 19), "武汉");
        map.put(new Student("易建联", 33), "广东");
        map.put(new Student("姚明", 34), "上海");

        Set<Student> s = map.keySet();


        for (Student su : s
                ) {
            System.out.println("姓名：" + su.getName() + "---------" + "年龄：" + su.getAge()
                    + "城市：" + map.get(su));
        }


    }
}
