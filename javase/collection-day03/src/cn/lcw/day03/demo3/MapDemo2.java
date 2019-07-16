package cn.lcw.day03.demo3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {


    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, String> hashMap = new HashMap<String, String>();
//添加元素到集合对象中g
        hashMap.put("习近平", "清华大学");
        hashMap.put("李克强", "北京大学");
        hashMap.put("江泽民", "上海交通大学");
        //获取所有的Entry对象
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
//遍历每一个Entry对象
        for (Map.Entry<String, String> set : entrySet) {
            String key = set.getKey();
            String value = set.getValue();
            System.out.println("姓名：" + key);
            System.out.println("毕业学校：" + value);
        }


    }
}
