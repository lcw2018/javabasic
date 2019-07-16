package com.lcw.demo01Map;


import java.util.HashMap;

/*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
   LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {

    public static void main(String[] args) {

        //  show1();
        // show2();
        show3();
        show4();

    }


      /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
     */


    private static void show4() {
        HashMap<String, Integer> hashMap4 = new HashMap<>();
        hashMap4.put("杨颖", 92);
        hashMap4.put("赵丽颖", 93);
        hashMap4.put("王丽坤", 96);
        hashMap4.put("景甜", 98);
        hashMap4.put("关晓彤", 97);
        System.out.println(hashMap4.containsKey("杨蓉"));
        System.out.println(hashMap4.containsKey("关晓彤"));

    }


       /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */


    private static void show3() {
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        hashMap3.put("杨颖", 92);
        hashMap3.put("赵丽颖", 93);
        hashMap3.put("王丽坤", 96);
        hashMap3.put("景甜", 98);
        hashMap3.put("关晓彤", 97);
        System.out.println(hashMap3);
        //{景甜=98, 杨颖=92, 赵丽颖=93, 王丽坤=96, 关晓彤=97}
        Integer integer = hashMap3.get("关晓彤");
        System.out.println(integer); //97

        System.out.println(hashMap3.get("范冰冰"));//null


    }


    /*
     public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
         返回值:V
             key存在,v返回被删除的值
             key不存在,v返回null
  */
    private static void show2() {

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("杨颖", 92);
        hashMap2.put("赵丽颖", 93);
        hashMap2.put("王丽坤", 96);
        hashMap2.put("景甜", 98);
        hashMap2.put("关晓彤", 97);
        System.out.println(hashMap2);//{景甜=98, 杨颖=92, 赵丽颖=93, 王丽坤=96, 关晓彤=97}
        Integer remove = hashMap2.remove("杨颖");
        System.out.println(remove); //92
        System.out.println(hashMap2); //{景甜=98, 赵丽颖=93, 王丽坤=96, 关晓彤=97}


    }


    /*
      public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
          返回值:v
              存储键值对的时候,key不重复,返回值V是null
              存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
   */
    private static void show1() {

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("杨颖", "黄晓明");
        hashmap.put("赵丽颖", "袁绍峰");
        String put1 = hashmap.put("邓超", "孙俪");
        String put2 = hashmap.put("邓超", "孙俪2");
        System.out.println(put1);  //null
        System.out.println(put2);   //返回被替换的对象"s孙俪”
        System.out.println(hashmap);//{邓超=孙俪2, 杨颖=黄晓明, 赵丽颖=袁绍峰}


    }


}
