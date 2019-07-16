package com.lcw.demo04JDK9;


/*
    JDK9的新特性:
        List接口,Set接口,Map接口:里边增加了一个静态的方法of,可以给集合一次性添加多个元素
        static <E> List<E> of​(E... elements)
        使用前提:
            当集合中存储的元素的个数已经确定了,不在改变时使用
     注意:
        1.of方法只适用于List接口,Set接口,Map接口,不适用于接接口的实现类
        2.of方法的返回值是一个不能改变的集合,集合不能再使用add,put方法添加元素,会抛出异常
        3.Set接口和Map接口在调用of方法的时候,不能有重复的元素,否则会抛出异常
 */


import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dem01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "d", "f", "s", "a");
        System.out.println(list);//[a, d, f, s, a]
      //  list.add("d");
     //   System.out.println(list);// java.lang.UnsupportedOperationException

        // Set<String> set = Set.of("a", "d", "f", "s", "a");

        //  System.out.println(set);//java.lang.UnsupportedOperationException
        Set<String> set = Set.of("a", "d", "f", "s");
        System.out.println(set);//[a, d, f, s, a]
     //   set.add("w");
    //    System.out.println(set);//java.lang.UnsupportedOperationException

        //  Map<String, Integer> map = Map.of("张三", 19, "李四", 20, "王五", 23, "张三", 23);

        //   System.out.println(map);//java.lang.UnsupportedOperationException
        Map<String, Integer> map = Map.of("张三", 19, "李四", 20, "王五", 23);
        System.out.println(map);//{张三=19, 李四=20, 王五=23}
        map.put("赵六", 23);
        System.out.println(map);//java.lang.UnsupportedOperationException

    }


}
