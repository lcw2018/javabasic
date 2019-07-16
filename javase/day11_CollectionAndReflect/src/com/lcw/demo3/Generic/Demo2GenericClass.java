package com.lcw.demo3.Generic;

import sun.net.www.content.text.Generic;

public class Demo2GenericClass {

    /*
    定义一个含有泛型的类,模拟ArrayList集合
    泛型是一个未知的数据类型,当我们不确定什么什么数据类型的时候,可以使用泛型
    泛型可以接收任意的数据类型,可以使用Integer,String,Student...
    创建对象的时候确定泛型的数据类型
 */
    public static void main(String[] args) {
        //不写泛型默认为object类型
        GenericClass aClass = new GenericClass();
        aClass.setName("字符串");
        System.out.println(aClass.getName());
        //创建GenericClass类，泛型使用String
        GenericClass<String> gc = new GenericClass<>();
        gc.setName("科比");
        String name = gc.getName();
        System.out.println(name);
        //创建GenericClass类，泛型使用Integer
        GenericClass<Integer> gc3 = new GenericClass<>();
        gc3.setName(10);
        Integer name1 = gc3.getName();
        System.out.println(name1);


    }


}
