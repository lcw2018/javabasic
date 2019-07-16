package cn.lcw.Collections.Demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/*
Comparable：强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的compareTo方法
        被称为它的自然比较方法。只能在类中实现compareTo()一次，不能经常修改类的代码实现自己想要的排序。实现
        此接口的对象列表（和数组）可以通过Collections.sort（和Arrays.sort）进行自动排序，对象可以用作有序映射中
        的键或有序集合中的元素，无需指定比较器。
        Comparator强行对某个对象进行整体排序。可以将Comparator 传递给sort方法（如Collections.sort或
        Arrays.sort），从而允许在排序顺序上实现精确控制。还可以使用Comparator来控制某些数据结构（如有序set或
        有序映射）的顺序，或者为那些没有自然顺序的对象collection提供排序*/

public class CollectoinsDemo3 {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("abd");
        list.add("gsd");
        list.add("dsfd");
        list.add("sds");
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });

        System.out.println(list);


    }


}
