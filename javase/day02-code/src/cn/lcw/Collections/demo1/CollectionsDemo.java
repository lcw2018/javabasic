package cn.lcw.Collections.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

       /* list.add(132);
        list.add(32);
        list.add(2343);
        list.add(34222);*/
        Collections.addAll(list,132,32,2343,34222);
        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);


    }


}
