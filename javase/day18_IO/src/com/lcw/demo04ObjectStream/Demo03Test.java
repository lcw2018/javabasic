package com.lcw.demo04ObjectStream;
/*
    练习：序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进序列化和反序列化
    分析:
        1.定义一个存储Person对象的ArrayList集合
        2.往ArrayList集合中存储Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        5.创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        7.把Object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */

import javax.naming.NamingEnumeration;
import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 1.定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();

        //  2.往ArrayList集合中存储Person对象
        list.add(new Person("赵丽颖", 18));
        list.add(new Person("景甜", 20));
        list.add(new Person("迪丽热巴", 28));
        list.add(new Person("古力拉扎", 24));
        list.add(new Person("江疏影", 21));
        list.add(new Person("杨蓉", 22));

        // 3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day18_IO\\list.txt"));
       // 4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        oos.writeObject(list);
        // 5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day18_IO\\list.txt"));
        // 6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object o = ois.readObject();
        System.out.println(o);
           // 7.把Object类型的集合转换为ArrayList类型
        //[Person{name='赵丽颖', age=18}, Person{name='景甜', age=20}, Person{name='迪丽热巴', age=28}, Person{name='古力拉扎', age=24}, Person{name='江疏影', age=21}, Person{name='杨蓉', age=22}]
        ArrayList<Person> people = (ArrayList<Person>) o;
       //8.遍历ArrayList集合
        for (Person p :
                people) {
            System.out.println(p);
        }
     /*   Person{name='赵丽颖', age=18}
        Person{name='景甜', age=20}
        Person{name='迪丽热巴', age=28}
        Person{name='古力拉扎', age=24}
        Person{name='江疏影', age=21}
        Person{name='杨蓉', age=22}
*/
       //9.释放资源
        ois.close();

        oos.close();

    }


}
