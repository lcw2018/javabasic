package cn.lcw.Collections.Demo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Demo {


    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("adc", 32));
        list.add(new Student("dfs", 43));
        list.add(new Student("kobe", 18));
        list.add(new Student("curry", 15));
        list.add(new Student("nowitzki",23));
        list.add(new Student("bas", 23));

/*//按照年龄降序排列
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });*/
//按照年龄降序，同时按照名字首字符升序排列
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() - o1.getAge();
                if (result == 0) {

                    result = o1.getName().charAt(0) - o2.getName().charAt(0);

                }
                return result;
            }
        });


        //Collections.sort(list);
        for (Student su : list
                ) {
            System.out.println(su);
        }


    }


}
