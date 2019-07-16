package cn.lcw.day03.demo4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {

       HashMap<Student, String> map = new HashMap<Student, String>();
      //  HashMap<Student, String> map = new LinkedHashMap<Student, String>();
        map.put(new Student("张三", 50), "北京");
        map.put(new Student("lisi", 24), "上海");
        map.put(new Student("王五", 38), "广州");
       // map.put(new Student("李四", 24), "深圳");

        Set<Student> set = map.keySet();
        for (Student s : set
                ) {
            String name = s.getName();
            int age = s.getAge();
            System.out.println("姓名：" + name
                    + "------" + "年龄：" + age+"------"+"住址："+map.get(s));
        }


    }


}
