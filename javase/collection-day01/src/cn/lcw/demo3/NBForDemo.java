package cn.lcw.demo3;

import java.util.ArrayList;
import java.util.Collection;

public class NBForDemo {

    public static void main(String[] args) {
        Collection<String> col = new ArrayList<String>();
        col.add("清华");
        col.add("北大");
        col.add("武大");
        col.add("华科");
        //增强for遍历集合
        for (String name : col) {
            System.out.println(name);
        }
    }

}
