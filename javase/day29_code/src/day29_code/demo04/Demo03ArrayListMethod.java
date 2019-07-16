package day29_code.demo04;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
ArrayList当中的常用方法有：

public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合（今后学习）来说，add添加动作不一定成功。

public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
public class Demo03ArrayListMethod {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();


        System.out.println(list);   //[]


        //向集合中添加元素
        list.add("赵丽颖");

        System.out.println(list);  //[赵丽颖]


        list.add("袁绍峰");
        list.add("黄晓明");
        list.add("杨颖");

        System.out.println(list);   //[赵丽颖, 袁绍峰, 黄晓明, 杨颖]


        //从集合中取出元素，索引从0开始
        String name = list.get(2);
        System.out.println(name);   //黄晓明


        //从集合中删除元素

        String whoRemove = list.remove(3);

        System.out.println(whoRemove); // 杨颖

        System.out.println(list);   //[赵丽颖, 袁绍峰, 黄晓明]


        //获取集合的长度值

        int size = list.size();

        System.out.println(size);    //3


    }


}
