package com.lcw.demo02.Set;

import java.util.HashSet;

public class Demo03HashSetSavePerson {



    /*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */


    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>();


        Person p1 = new Person("科比", 34);
        Person p2 = new Person("科比", 34);
        Person p3 = new Person("科比", 33);
        System.out.println(p1.hashCode());//460141958
        System.out.println(p2.hashCode());//1163157884
         //重写equals和hashcode方法之后

        //30825504
        //30825504
        System.out.println(p1 == p2); //false         //false
        System.out.println(p1.equals(p2));//false     //true

        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);
        // 1.没有重写equals方法和hashcode方法
        // [Person{name='科比', age=33}, Person{name='科比', age=34}, Person{name='科比', age=34}]
       // 2.重写equals方法和hashcode方法
       // [Person{name='科比', age=34}, Person{name='科比', age=33}]
    }
}
