package com.lcw.demo03.hashCode;

public class Demo01HashCode {

    /*
    哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
    在Object类有一个方法,可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值。
    hashCode方法的源码:
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */

    public static void main(String[] args) {

        Person person1 = new Person();
        int code1 = person1.hashCode();
        System.out.println(code1);   //460141958
        Person person2 = new Person();
        int code2 = person2.hashCode();
        System.out.println(code2);   //1163157884

        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(person1);//com.lcw.demo03.hashCode.Person@1b6d3586
        System.out.println(person2); //com.lcw.demo03.hashCode.Person@4554617c

        System.out.println(person1 == person2);//false

        /*
            String类的哈希值
                String类重写Obejct类的hashCode方法
         */

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        //巧合，刚好hashcode值相等
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395


    }


}
