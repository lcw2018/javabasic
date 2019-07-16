package com.lcw.demo05.Collections;

/*
    java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

     Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(67);
        list.add(35);
        list.add(5);
        list.add(54);
        System.out.println(list);//[3, 67, 35, 5, 54]
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;


            }
        });

        System.out.println(list);//[3, 5, 35, 54, 67]


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张敏", 54));
        students.add(new Student("黄圣依", 34));
        students.add(new Student("汤唯", 45));
        students.add(new Student("张雨绮", 24));
        students.add(new Student("刘岩", 24));
        System.out.println(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(students);


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排列
                int result = o1.getAge() - o2.getAge();

                //如果年龄相等，按照姓名的首字母排列
                if (result == 0) {


                    return o1.getName().charAt(0) - o2.getName().charAt(0);

                }
                return result;


            }
        });

        System.out.println(students);
    }
}
