package day29_code.demo05;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
题目：
自定义4个学生对象，添加到集合，并遍历。

思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象。
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
public class Demo02ArrayListStudent {


    public static void main(String[] args) {

        ArrayList<Student> stu = new ArrayList<>();


        Student one = new Student("赵丽颖", 18);
        Student two = new Student("王小七", 21);
        Student three = new Student("景甜", 22);

        stu.add(one);
        stu.add(two);
        stu.add(three);

        //遍历集合
        for (int i = 0; i < stu.size(); i++) {

            System.out.println("姓名是：" + stu.get(i).getName() + ",年龄是:" + stu.get(i).getAge());


        }


    }

}
