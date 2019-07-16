package cn.lcw.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
//使用多态方式创建对象
        Collection<String> col = new ArrayList<String>();

        //添加元素到集合
        col.add("张无忌");
        col.add("段誉");
        col.add("乔峰");
        col.add("虚竹");
//使用迭代器遍历，每个结合对象都有自己的迭代器
        Iterator<String> iterator = col.iterator();
        //泛型代表的是迭代出的对象的类型
        while (iterator.hasNext()) {//判断是否有迭代元素
            String s = iterator.next();//获取迭代出的元素
            System.out.println(s);

        }


    }


}
