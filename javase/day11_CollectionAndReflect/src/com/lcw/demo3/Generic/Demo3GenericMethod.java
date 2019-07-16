package com.lcw.demo3.Generic;


public class Demo3GenericMethod {


    public static void main(String[] args) {
        GenericMethod gm1 = new GenericMethod();
        //调用还有泛型的方法method1,传递什么类型，泛型就是什么类型
        gm1.method1("小七");
        gm1.method1(10);
        gm1.method1(2.34);
        gm1.method1(true);

        gm1.method2("景甜");
        //调用含有泛型的静态方法
        GenericMethod.method2(20);
        GenericMethod.method2("王丽坤");
    }

}
