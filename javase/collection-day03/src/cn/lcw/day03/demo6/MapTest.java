package cn.lcw.day03.demo6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapTest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i) + "")) {
                int count = map.get(str.charAt(i) + "");
                map.put(str.charAt(i) + "", count + 1);


            } else {

                map.put(str.charAt(i) + "", 1);

            }
        }

      /*  Set<String> set = map.keySet();
        for (String s : set
                ) {
            System.out.println(s + "-------" + map.get(s));
        }*/

        System.out.println(map);
    }


}
