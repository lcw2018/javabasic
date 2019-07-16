package com.lcw.demo3.Generic;


/*
    泛型的上限限定: ? extends E  代表使用的泛型只能是E类型的子类/本身
    泛型的下限限定: ? super E    代表使用的泛型只能是E类型的父类/本身
 */


import java.util.ArrayList;

public class Demo6Generic {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();


     //   getElenment1(list1);    报错
        getElenment1(list2);
        getElenment1(list3);
   //     getElenment1(list4);  报错

     //   getElenment1(list1);  报错
     //   getElenment2(list2);  报错
        getElenment2(list3);
        getElenment2(list4);


    }

    //泛型的下限，此时的泛型？，必须是Number类的父类或者是其本身
    private static void getElenment2(ArrayList<? super Number> list) {


    }
   //泛型的上限，此时的泛型？，必须是Number类的子类或者是其本身

    private static void getElenment1(ArrayList<? extends Number> list) {
    }


}
