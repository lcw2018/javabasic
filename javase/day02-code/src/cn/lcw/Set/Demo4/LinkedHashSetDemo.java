package cn.lcw.Set.Demo4;

import java.util.Iterator;
import java.util.LinkedHashSet;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class LinkedHashSetDemo {


    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("123");
        set.add("012");
        set.add("234");
        set.add("455");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }


    }


}
