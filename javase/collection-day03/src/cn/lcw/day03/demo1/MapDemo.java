package cn.lcw.day03.demo1;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {


        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("黄晓明", "杨颖");
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");

        System.out.println(hashMap);

        System.out.println(hashMap.remove("邓超"));
        System.out.println(hashMap);

        System.out.println(hashMap.get("黄晓明"));
        System.out.println(hashMap.get("李晨"));


    }


}
