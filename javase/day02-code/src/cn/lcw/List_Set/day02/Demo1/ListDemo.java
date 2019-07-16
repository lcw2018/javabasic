package cn.lcw.List_Set.day02.Demo1;

/*List作为Collection集合的子接口，不但继承了Collection接口中的全部方法，而且还增加了一些根据元素索引来操
作集合的特有方法，如下：
public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
public E get(int index) :返回集合中指定位置的元素。
public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。*/


import java.util.ArrayList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        //创建list集合
        List<String> list = new ArrayList<String>();
     //往尾部添加元素
        list.add("刘德华");
        list.add("黎明");
        list.add("张学友");
        list.add("郭富城");
        System.out.println(list);


        //往指定的位置添加元素
        list.add(1,"周星驰");
        System.out.println(list);

        System.out.println("请删除郭富城：");

        //删除指定索引的元素
        System.out.println(list.remove(4));
        System.out.println(list);

        //在指定的位置进行元素替代
        list.set(1, "向华强");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String name : list
                ) {
            System.out.println(name);
        }


    }


}
