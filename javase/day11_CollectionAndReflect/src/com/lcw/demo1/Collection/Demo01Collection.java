package com.lcw.demo1.Collection;

import java.util.Collection;
import java.util.HashSet;

public class Demo01Collection {

    /*
    java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

    共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */


    public static void main(String[] args) {

        Collection<String> col = new HashSet<>();
        System.out.println(col);
        //public boolean add(E e)：  把给定的对象添加到当前集合中 。
        col.add("乔峰");
        System.out.println(col);

        //    public void clear() :清空集合中所有的元素。
        col.clear();

        System.out.println(col);

        col.add("乔峰");
        col.add("虚竹");
        col.add("段誉");
        col.add("王语嫣");
        System.out.println(col);

        //public boolean remove(E e): 把给定的对象在当前集合中删除。
        col.remove("王语嫣");
        System.out.println(col);


        //  public boolean contains(E e): 判断当前集合中是否包含给定的对象。

        System.out.println(col.contains("乔峰"));
        System.out.println(col.contains("王语嫣"));


        // public boolean isEmpty(): 判断当前集合是否为空。

        System.out.println(col.isEmpty());
        //   public int size(): 返回集合中元素的个数。

        System.out.println(col.size());

        //  public Object[] toArray(): 把集合中的元素，存储到数组中

        Object[] objects = col.toArray();
        for (Object o : objects
        ) {
            System.out.println(o);
        }

    }


}
