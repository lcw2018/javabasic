package cn.lcw.day03.demo2;

import java.util.HashMap;
import java.util.Set;

public class MapDemo01 {

    public static void main(String[] args) {
        //创建MAP集合对象
        HashMap<String, String> hashMap = new HashMap<String, String>();

        //添加元素到集合
        hashMap.put("科比", "詹姆斯");
        hashMap.put("费德勒", "纳达尔");
        hashMap.put("林丹", "李宗伟");
        //获取所有的键，键集
        Set<String> set = hashMap.keySet();
        //遍历键集，得到每一个键
        for (String key : set
                ) {

            //得到每一个键所对应的键值

            String value = hashMap.get(key);
            System.out.println(key + "棋逢对手" + value);
        }


    }


}
