package cn.lcw.Set.Demo2;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("abc");
        hashSet.add("cba");
        hashSet.add("bca");
        hashSet.add(new String("abc"));

        for (String str : hashSet
                ) {
            System.out.println(str);
        }


    }
}
