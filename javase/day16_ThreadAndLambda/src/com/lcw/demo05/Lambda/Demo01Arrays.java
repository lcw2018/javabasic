package com.lcw.demo05.Lambda;

import java.util.Arrays;
import java.util.Comparator;


/*
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
        */
public class Demo01Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] people = {new Person("赵丽颖", 19),
                new Person("景甜", 18), new Person("杨颖", 20)};

        //使用Arrays中的sort方法对people数组中的Person对象按照年龄升序排序
     /*   Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        //使用lambda简化匿名内部类
        Arrays.sort(people, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
       //带参数和返回参数，此时如果选择return语句，则花括号不能省略

        //简化lambda表达式
        Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person p : people
        ) {
            System.out.println(p);
        }


    }

}
