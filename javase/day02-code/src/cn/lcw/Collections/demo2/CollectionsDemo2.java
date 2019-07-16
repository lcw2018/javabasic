package cn.lcw.Collections.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;




/*说到排序了，简单的说就是两个对象之间比较大小，那么在JAVA中提供了两种比较实现的方式，一种是比较死板的
        采用java.lang.Comparable 接口去实现，一种是灵活的当我需要做排序的时候在去选择的
        java.util.Comparator 接口完成。*/
public class CollectionsDemo2 {


    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("abd");
        list.add("nad");
        list.add("dff");
        list.add("bsd");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}
