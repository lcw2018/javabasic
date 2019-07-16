package cn.lcw.Set.Demo3;

import java.util.HashSet;

public class HashSetDemo2 {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<Student>();

        Student s = new Student("科比", 33);
        hashSet.add(s);
        hashSet.add(new Student("库里", 12));
        hashSet.add(new Student("詹姆斯", 32));
        hashSet.add(s);
        for (Student su :hashSet
                ) {
            System.out.println(su);
        }

    }


}
