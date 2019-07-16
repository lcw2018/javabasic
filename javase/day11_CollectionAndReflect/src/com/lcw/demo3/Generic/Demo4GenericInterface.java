package com.lcw.demo3.Generic;


//测试含有泛型的接口
public class Demo4GenericInterface {

    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gif1 = new GenericInterfaceImpl1();
        gif1.method("中国");
        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi1 = new GenericInterfaceImpl2<>();
        gi1.method(443);

        GenericInterfaceImpl2<Double> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(123.34);


    }


}
