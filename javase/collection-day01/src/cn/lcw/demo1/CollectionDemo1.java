package cn.lcw.demo1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {


    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();

        c.add("科比");
        c.add("詹姆斯");
        c.add("库里");
        System.out.println(c);
        System.out.println("集合中是否存在詹姆斯:" + c.contains("詹姆斯"));
        c.remove("詹姆斯");
        System.out.println(c);
        System.out.println("集合中元素的个数为：" + c.size());

        //转换成一个Object数组
        Object[] object = c.toArray();
        //遍历数组
        for (int i = 0; i < object.length; i++) {

            System.out.println(object[i]);


        }
        c.clear();

        System.out.println(c);
        System.out.println("集合是否为空：" + c.isEmpty());

    }
}