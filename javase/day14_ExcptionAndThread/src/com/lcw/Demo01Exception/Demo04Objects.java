package com.lcw.Demo01Exception;


import java.util.Objects;

/*
    Obects类中的静态方法
    public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
    源码:
        public static <T> T requireNonNull(T obj) {
            if (obj == null)
                throw new NullPointerException();
            return obj;
        }
 */
public class Demo04Objects {


    public static void main(String[] args) {
        menthod(null);

    }

    private static void menthod(Object o) {
        //对象传递过来的参数会进行合法性判断，看是否为空
       /* if(o==null){


         throw    new NullPointerException("传递的值为null");
        }*/


    /*  Objects.requireNonNull(o);
      Objects.requireNonNull(o,"传递的值为null");*/


    }
}
